package edu.pict.ecommerce.authservice.service;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.function.Function;

/**
 * Service interface for handling JWT (JSON Web Token) operations.
 */
public interface JWTService {

    /**
     * Generates a JWT token for the specified username and role.
     *
     * @param username the username to embed in the token
     * @param role the role of the user
     * @return the generated JWT token as a String
     */
    String generateToken(String username, String role);

    /**
     * Retrieves the secret key used for signing and validating JWT tokens.
     *
     * @return the {@link SecretKey} used in JWT operations
     */
    SecretKey getKey();

    /**
     * Extracts the user role from the provided JWT token.
     *
     * @param token the JWT token
     * @return the role of the user embedded in the token
     */
    String ExtractUserRole(String token);

    /**
     * Extracts the username (subject) from the JWT token.
     *
     * @param token the JWT token
     * @return the username
     */
    String extractUserName(String token);

    /**
     * Extracts a specific claim from the JWT token using a resolver function.
     *
     * @param token the JWT token
     * @param claimResolver a function to extract a claim from the {@link Claims} object
     * @param <T> the type of the claim
     * @return the extracted claim
     */
    <T> T extractClaim(String token, Function<Claims, T> claimResolver);

    /**
     * Extracts all claims from the JWT token.
     *
     * @param token the JWT token
     * @return the {@link Claims} object containing all token claims
     */
    Claims extractAllClaims(String token);

    /**
     * Validates the JWT token against the given user details.
     *
     * @param token the JWT token
     * @param userDetails the user details to match against the token's data
     * @return true if the token is valid; false otherwise
     */
    boolean validateToken(String token, UserDetails userDetails);

    /**
     * Checks whether the JWT token has expired.
     *
     * @param token the JWT token
     * @return true if the token is expired; false otherwise
     */
    boolean isTokenExpired(String token);

    /**
     * Extracts the expiration date from the JWT token.
     *
     * @param token the JWT token
     * @return the expiration {@link Date} of the token
     */
    Date extractExpiration(String token);
}
