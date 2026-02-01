package edu.pict.ecommerce.authservice.dtos;

import edu.pict.ecommerce.authservice.model.enums.Role;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object used for user registration.
 * Carries the required user details to create a new account in the system.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {

    /**
     * The unique username chosen by the user.
     */
    private String username;

    /**
     * The password for the user account.
     */
    private String password;

    /**
     * The user's first name.
     */
    private String firstName;

    /**
     * The user's last name.
     */
    private String lastName;

    /**
     * The user's email address.
     */
    @Email(message = "Enter Proper email")
    private String email;

    /**
     * The user's phone number.
     */
    private String phoneNumber;

    /**
     * The role assigned to the user (e.g., ADMIN, CUSTOMER).
     */
    private Role role;
}
