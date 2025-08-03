package edu.pict.ecommerce.apigateway.service.implementation;

import edu.pict.ecommerce.apigateway.service.JWTService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Implementation of {@link JWTService} for generating, validating, and parsing JWT tokens.
 * <p>
 * Uses HMAC SHA-based signing with a secret key configured via application properties.
 */
@Service
public class JWTServiceImplementation implements JWTService {

    /**
     * Secret key used for signing the JWT token. Injected from application properties.
     */
    @Value("${jwt.secret}")
    private String secretKey;

    /**
     * Expiration time for the JWT token in milliseconds. Injected from application properties.
     */
    @Value("${jwt.expiration}")
    private long expirationInMillis;

    /**
     * Generates a JWT token with the given username and role as claims.
     *
     * @param username the subject (usually the username or user ID)
     * @param role     the user role (e.g., USER, ADMIN)
     * @return a signed and compacted JWT token string
     */
    @Override
    public String generateToken(String username, String role) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("role", role);
        claims.put("username", username);

        return Jwts.builder()
                .claims()
                .add(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + expirationInMillis))
                .and()
                .signWith(getSigningKey())
                .compact();
    }

    /**
     * Extracts the user role from the JWT token.
     *
     * @param token the JWT token
     * @return the value of the "role" claim
     */
    @Override
    public String extractUserRole(String token) {
        return extractClaim(token, claims -> claims.get("role", String.class));
    }

    /**
     * Extracts the subject (username) from the JWT token.
     *
     * @param token the JWT token
     * @return the username embedded in the token
     */
    @Override
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    /**
     * Checks whether the token is expired.
     *
     * @param token the JWT token
     * @return true if token is expired, false otherwise
     */
    @Override
    public boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    /**
     * Extracts the expiration date from the token.
     *
     * @param token the JWT token
     * @return the expiration {@link Date} of the token
     */
    @Override
    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    /**
     * Validates the token by checking for expiration and catching any parsing exceptions.
     *
     * @param token the JWT token
     * @return true if valid and not expired, false otherwise
     */
    @Override
    public boolean validateToken(String token) {
        try {
            return !isTokenExpired(token); // Parsing issues will be caught here
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Extracts a specific claim using a resolver function.
     *
     * @param token          the JWT token
     * @param claimsResolver a function that receives Claims and returns desired value
     * @param <T>            the type of the claim
     * @return the resolved claim value
     */
    @Override
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        return claimsResolver.apply(extractAllClaims(token));
    }

    /**
     * Extracts all claims from the token after verifying the signature.
     *
     * @param token the JWT token
     * @return a {@link Claims} object containing all claims
     */
    @Override
    public Claims extractAllClaims(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    /**
     * Generates the secret signing key used to sign or verify tokens.
     *
     * @return a {@link SecretKey} generated from the configured secret
     */
    @Override
    public SecretKey getSigningKey() {
        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
