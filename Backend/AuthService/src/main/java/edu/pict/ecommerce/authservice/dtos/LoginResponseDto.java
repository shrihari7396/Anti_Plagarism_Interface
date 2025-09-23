package edu.pict.ecommerce.authservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO representing the response returned after a successful login.
 * It contains user details and the generated JWT token.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginResponseDto {

    /**
     * The first name of the authenticated user.
     */
    private String firstName;

    /**
     * The last name of the authenticated user.
     */
    private String lastName;

    /**
     * The email address of the authenticated user.
     */
    private String email;

    /**
     * The JWT token issued after successful authentication.
     */
    private String jwtToken;
}
