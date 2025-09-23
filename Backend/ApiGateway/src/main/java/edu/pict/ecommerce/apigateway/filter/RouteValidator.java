package edu.pict.ecommerce.apigateway.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

/**
 * RouteValidator is used to determine whether an incoming request should be secured (i.e., require authentication).
 * <p>
 * It defines a predicate that checks the request path against known public (non-secured) routes.
 */
@Component
public class RouteValidator {
    /**
     * Predicate to check if a route is secured.
     * <p>
     * Any route that does not contain "/api/v1/auth" in its path is considered secured.
     * Typically, routes like /api/v1/auth/register, /api/v1/auth/login, etc., are public.
     */
    public Predicate<ServerHttpRequest> isSecured =
            request -> !request.getURI().getPath().contains("/api/v1/auth");
}
