package edu.pict.ecommerce.apigateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

//@Component
//public class RouteValidator {
//    public static final List<String> routes = List.of(
//            "auth/register"
//            , "auth/login"
//            , "auth/logout"
//    );
//
//    public Predicate<ServerHttpRequest> isSecured = request ->
//            routes.stream().noneMatch(uri -> request.getURI().getPath().contains(uri));
//
//}


@Component
public class RouteValidator {

    public Predicate<ServerHttpRequest> isSecured =
            request -> !request.getURI().getPath().contains("/api/v1/auth");
}
