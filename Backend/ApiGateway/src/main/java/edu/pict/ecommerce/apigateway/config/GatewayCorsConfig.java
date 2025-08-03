package edu.pict.ecommerce.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * Configuration class for enabling and customizing CORS (Cross-Origin Resource Sharing)
 * settings in the API Gateway using Spring WebFlux.
 */
@Configuration
public class GatewayCorsConfig {

    /**
     * Bean definition for CorsWebFilter to handle CORS preflight and actual requests.
     *
     * @return CorsWebFilter that applies the configured CORS settings to incoming HTTP requests.
     */
    @Bean
    public CorsWebFilter corsWebFilter() {
        // Create a new CorsConfiguration instance
        CorsConfiguration config = new CorsConfiguration();

        // Allow cookies or authorization headers to be included in the request
        config.setAllowCredentials(true);

        // Allow all origins using pattern matching
        config.addAllowedOriginPattern("*");

        // Allow all headers (e.g., Content-Type, Authorization)
        config.addAllowedHeader("*");

        // Allow all HTTP methods (GET, POST, PUT, DELETE, etc.)
        config.addAllowedMethod("*");

        // Define a URL-based source for the above CORS configuration
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        // Apply the configuration to all endpoints (/**)
        source.registerCorsConfiguration("/**", config);

        // Return a new CorsWebFilter with the configured source
        return new CorsWebFilter(source);
    }
}
