package edu.pict.ecommerce.authservice.service.Implementation;

import edu.pict.ecommerce.authservice.dtos.LoginDTO;
import edu.pict.ecommerce.authservice.dtos.LoginResponseDto;
import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.mapper.UserMapper;
import edu.pict.ecommerce.authservice.model.User;
import edu.pict.ecommerce.authservice.repository.UserRepository;
import edu.pict.ecommerce.authservice.service.AuthService;
import edu.pict.ecommerce.authservice.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImplementation implements AuthService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JWTService  jwtService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User createUser(RegisterDTO registerDTO) {
        registerDTO.setPassword(bCryptPasswordEncoder.encode(registerDTO.getPassword()));
        return userRepository.save(UserMapper.fromRegisterDTO(registerDTO));
    }

    @Override
    public LoginResponseDto validateUser(LoginDTO loginDTO) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword())
            );

            User user = userRepository.findByUsername(loginDTO.getUsername());
            LoginResponseDto loginResponseDto = LoginResponseDto.builder()
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .email(user.getEmail())
                    .jwtToken(jwtService.generateToken(user.getUsername(), user.getRole().toString()))
                    .build();

            if(authentication.isAuthenticated()) {
                return loginResponseDto;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
