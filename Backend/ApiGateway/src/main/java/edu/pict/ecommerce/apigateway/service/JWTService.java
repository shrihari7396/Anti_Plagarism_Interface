package edu.pict.ecommerce.apigateway.service;

import java.util.Date;

public interface JWTService {
    String generateToken(String username, String role);
    String extractUserRole(String token);
    String extractUsername(String token);
    boolean isTokenExpired(String token);
    Date extractExpiration(String token);
    boolean validateToken(String token);
    <T> T extractClaim(String token, java.util.function.Function<io.jsonwebtoken.Claims, T> claimsResolver);
    io.jsonwebtoken.Claims extractAllClaims(String token);
    javax.crypto.SecretKey getSigningKey();
}
