package edu.pict.ecommerce.apigateway.service;

import io.jsonwebtoken.Claims;

import javax.crypto.SecretKey;
import java.util.Date;

/**
 * JWTService defines operations for creating, validating, and extracting information from JWT (JSON Web Token) tokens.
 * <p>
 * This service is used by the API Gateway to handle token-based authentication and authorization.
 */
public interface JWTService {

    /**
     * Generates a JWT token with the given username and role as claims.
     *
     * @param username the username to include in the token
     * @param role     the role (e.g., USER, ADMIN) to include in the token
     * @return a signed JWT token string
     */
    String generateToken(String username, String role);

    /**
     * Extracts the user role from the given JWT token.
     *
     * @param token the JWT token
     * @return the role string stored in the token
     */
    String extractUserRole(String token);

    /**
     * Extracts the username from the given JWT token.
     *
     * @param token the JWT token
     * @return the username stored in the token
     */
    String extractUsername(String token);

    /**
     * Checks whether the given JWT token has expired.
     *
     * @param token the JWT token
     * @return true if the token has expired, false otherwise
     */
    boolean isTokenExpired(String token);

    /**
     * Extracts the expiration date of the JWT token.
     *
     * @param token the JWT token
     * @return the expiration {@link Date} of the token
     */
    Date extractExpiration(String token);

    /**
     * Validates the token structure and ensures it has not expired or been tampered with.
     *
     * @param token the JWT token
     * @return true if the token is valid, false otherwise
     */
    boolean validateToken(String token);

    /**
     * Extracts a specific claim from the token using a provided resolver function.
     *
     * @param token          the JWT token
     * @param claimsResolver a function to resolve the specific claim from the token
     * @param <T>            the return type of the claim
     * @return the extracted claim value
     */
    <T> T extractClaim(String token, java.util.function.Function<io.jsonwebtoken.Claims, T> claimsResolver);

    /**
     * Extracts all claims from the given JWT token.
     *
     * @param token the JWT token
     * @return all claims present in the token
     */
    Claims extractAllClaims(String token);

    /**
     * Returns the secret key used to sign or verify the JWT token.
     *
     * @return a {@link javax.crypto.SecretKey} used for signing JWTs
     */
    SecretKey getSigningKey();
}
