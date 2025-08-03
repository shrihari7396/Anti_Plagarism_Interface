package edu.pict.ecommerce.authservice.service;

import edu.pict.ecommerce.authservice.dtos.LoginDTO;
import edu.pict.ecommerce.authservice.dtos.LoginResponseDto;
import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.model.User;

/**
 * Interface defining authentication-related services such as user registration and login validation.
 */
public interface AuthService {

    /**
     * Registers a new user in the system using the provided registration data.
     *
     * @param registerDTO the data transfer object containing user registration information
     * @return the created User entity
     */
    User createUser(RegisterDTO registerDTO);

    /**
     * Validates the credentials of a user attempting to log in and returns the login response.
     *
     * @param loginDTO the data transfer object containing user login credentials
     * @return a {@link LoginResponseDto} containing user details and JWT token if authentication is successful
     */
    LoginResponseDto validateUser(LoginDTO loginDTO);
}
