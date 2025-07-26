package edu.pict.ecommerce.apigateway.filter;

import edu.pict.ecommerce.apigateway.service.JWTService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

    @Autowired
    private JWTService jwtService;

    @Autowired
    private RouteValidator routeValidator;

    public AuthenticationFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {

            // Check if route is secured
            if (routeValidator.isSecured.test(exchange.getRequest())) {
                // 1. Check if Authorization header is present
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Missing Authorization Header");
                }

                String authHeader = exchange.getRequest().getHeaders().getFirst(HttpHeaders.AUTHORIZATION);

                if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                    throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid Authorization Header");
                }

                String token = authHeader.substring(7);

                // 2. Validate Token
                if (!jwtService.validateToken(token)) {
                    throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid or Expired Token");
                }

                // 3. Extract claims
                String username = jwtService.extractUsername(token);
                String role = jwtService.extractUserRole(token);

                String path = exchange.getRequest().getPath().toString();

                if (path.startsWith("/api/v1/admin") && !role.equals("ADMIN")) {
                    throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Access denied for non-admin");
                }

                if (path.startsWith("/api/v1/user") && !(role.equals("USER") || role.equals("ADMIN"))) {
                    throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Access denied");
                }

                // 4. Add claims to downstream request headers
                ServerHttpRequest modifiedRequest = exchange.getRequest().mutate()
                        .header("X-User-Name", username)
                        .header("X-User-Role", role)
                        .build();

                return chain.filter(exchange.mutate().request(modifiedRequest).build());
            }

            // If public route → proceed as is
            return chain.filter(exchange);
        });
    }

    @Data
    public static class Config {
        private boolean enabled = true;
    }
}
