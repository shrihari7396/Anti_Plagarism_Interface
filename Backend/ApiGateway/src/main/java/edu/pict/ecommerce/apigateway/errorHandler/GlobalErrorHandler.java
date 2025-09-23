package edu.pict.ecommerce.apigateway.errorHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBufferFactory;

/**
 * Global error handler for the API Gateway in a reactive Spring WebFlux environment.
 * <p>
 * This class handles uncaught exceptions in the WebFlux pipeline and formats them
 * as JSON responses for the client.
 */
@Component
@Order(-2) // Ensures this handler executes before the default error handler
public class GlobalErrorHandler implements ErrorWebExceptionHandler {

    // ObjectMapper for serializing error details to JSON
    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Handles all exceptions that occur during request processing in the WebFlux pipeline.
     *
     * @param exchange the current server exchange
     * @param ex       the exception that was thrown
     * @return a Mono<Void> signaling when error handling is complete
     */
    @Override
    public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
        // Default to internal server error
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        // If the exception is of type ResponseStatusException, extract the status
        if (ex instanceof ResponseStatusException responseStatusException) {
            status = (HttpStatus) responseStatusException.getStatusCode();
        }

        // Set the HTTP status and content type
        exchange.getResponse().setStatusCode(status);
        exchange.getResponse().getHeaders().setContentType(MediaType.APPLICATION_JSON);

        // Build a map containing error details
        Map<String, Object> errorAttributes = Map.of(
                "status", status.value(),
                "error", status.getReasonPhrase(),
                "message", ex.getMessage(),
                "path", exchange.getRequest().getPath().value()
        );

        byte[] bytes;
        try {
            // Serialize the error attributes to a JSON byte array
            bytes = objectMapper.writeValueAsBytes(errorAttributes);
        } catch (Exception e) {
            // Fallback error response if serialization fails
            bytes = ("{\"status\":500,\"error\":\"Internal Server Error\",\"message\":\"Serialization failed\"}")
                    .getBytes(StandardCharsets.UTF_8);
        }

        // Wrap the byte array into a DataBuffer
        DataBufferFactory bufferFactory = exchange.getResponse().bufferFactory();
        DataBuffer buffer = bufferFactory.wrap(bytes);

        // Write the error buffer to the HTTP response
        return exchange.getResponse().writeWith(Mono.just(buffer));
    }
}
