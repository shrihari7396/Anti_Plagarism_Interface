package edu.pict.ecommerce.authservice.controller;

import edu.pict.ecommerce.authservice.dtos.LoginDTO;
import edu.pict.ecommerce.authservice.dtos.LoginResponseDto;
import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.model.User;
import edu.pict.ecommerce.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthService authService;

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @PostMapping("/register")
    public User register(@RequestBody RegisterDTO registerDTO) {
        return  authService.createUser(registerDTO);
    }

    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginDTO loginDTO) {
        return  authService.validateUser(loginDTO);
    }
}
