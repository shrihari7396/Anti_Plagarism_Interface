package edu.pict.ecommerce.authservice.dtos;

import edu.pict.ecommerce.authservice.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object for handling login requests.
 * Contains user credentials and their role.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginDTO {

    /**
     * The username used for login.
     */
    private String username;

    /**
     * The password used for login.
     */
    private String password;

    /**
     * The role of the user trying to log in (e.g., ADMIN, USER).
     */
    private Role role;
}
