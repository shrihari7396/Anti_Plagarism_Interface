package edu.pict.ecommerce.authservice.service.Implementation;

import edu.pict.ecommerce.authservice.dtos.LoginDTO;
import edu.pict.ecommerce.authservice.dtos.LoginResponseDto;
import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.mapper.UserMapper;
import edu.pict.ecommerce.authservice.model.User;
import edu.pict.ecommerce.authservice.repository.UserRepository;
import edu.pict.ecommerce.authservice.service.AuthService;
import edu.pict.ecommerce.authservice.service.JWTService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
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
        User user = userRepository.findByUsername(loginDTO.getUsername());

        // 4. Generate JWT
        String token = jwtService.generateToken(
                user.getUsername(),
                user.getRole().toString()
        );

        // 5. Return the response with token
        return LoginResponseDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .jwtToken(token)
                .build();
    }
}
