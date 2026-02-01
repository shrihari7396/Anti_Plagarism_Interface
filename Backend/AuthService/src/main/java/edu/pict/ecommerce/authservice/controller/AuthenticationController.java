package edu.pict.ecommerce.authservice.controller;

import edu.pict.ecommerce.authservice.dtos.LoginDTO;
import edu.pict.ecommerce.authservice.dtos.LoginResponseDto;
import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.model.User;
import edu.pict.ecommerce.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Controller for handling authentication-related operations such as login and registration.
 */
@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    private AuthService authService;

    /**
     * Basic endpoint to test if the service is up.
     *
     * @return A simple "Hello World" string.
     */
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
    /**
     * Endpoint to register a new user.
     *
     * @param registerDTO DTO containing user registration information.
     * @return The created {@link User} object.
     */
    @PostMapping("/register")
    public User register(@RequestBody RegisterDTO registerDTO) {
        return  authService.createUser(registerDTO);
    }

    /**
     * Endpoint for user login and token generation.
     *
     * @param loginDTO DTO containing login credentials.
     * @return {@link LoginResponseDto} containing JWT and user information.
     */
    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginDTO loginDTO) {
        return  authService.validateUser(loginDTO);
    }
}
