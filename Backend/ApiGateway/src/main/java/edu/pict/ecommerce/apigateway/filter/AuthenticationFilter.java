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

/**
 * Custom Gateway Filter for authenticating incoming requests using JWT tokens.
 * <p>
 * It checks whether a route is secured, validates the JWT token from the Authorization header,
 * and ensures the user has appropriate roles to access specific endpoints.
 */
@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

    // Service to validate JWT tokens and extract claims
    @Autowired
    private JWTService jwtService;

    // Validator to determine if a request path requires authentication
    @Autowired
    private RouteValidator routeValidator;

    /**
     * Constructor for initializing with configuration class.
     */
    public AuthenticationFilter() {
        super(Config.class);
    }

    /**
     * Main logic for applying the authentication filter to requests.
     *
     * @param config Configuration object for the filter.
     * @return GatewayFilter that processes authentication logic.
     */
    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {

            // Check if the request route is secured
            if (routeValidator.isSecured.test(exchange.getRequest())) {
                // 1. Check for presence of Authorization header
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Missing Authorization Header");
                }

                String authHeader = exchange.getRequest().getHeaders().getFirst(HttpHeaders.AUTHORIZATION);

                // 2. Check if Authorization header is valid Bearer token
                if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                    throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid Authorization Header");
                }

                // Extract token from header
                String token = authHeader.substring(7);

                // 3. Validate the JWT token
                if (!jwtService.validateToken(token)) {
                    throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid or Expired Token");
                }

                // 4. Extract user claims from token
                String username = jwtService.extractUsername(token);
                String role = jwtService.extractUserRole(token);

                String path = exchange.getRequest().getPath().toString();

                // 5. Role-based access checks
                if (path.startsWith("/api/v1/admin") && !role.equals("ADMIN")) {
                    throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Access denied for non-admin");
                }

                if (path.startsWith("/api/v1/user") && !(role.equals("USER") || role.equals("ADMIN"))) {
                    throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Access denied");
                }

                // 6. Add claims to request headers for downstream services
                ServerHttpRequest modifiedRequest = exchange.getRequest().mutate()
                        .header("X-User-Name", username)
                        .header("X-User-Role", role)
                        .build();

                return chain.filter(exchange.mutate().request(modifiedRequest).build());
            }

            // If route is public, proceed without modification
            return chain.filter(exchange);
        });
    }

    /**
     * Configuration class for enabling or disabling the authentication filter.
     */
    @Data
    public static class Config {
        private boolean enabled = true;
    }
}
