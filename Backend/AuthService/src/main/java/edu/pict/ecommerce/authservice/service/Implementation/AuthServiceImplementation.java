package edu.pict.ecommerce.authservice.service.Implementation;

import edu.pict.ecommerce.authservice.dtos.LoginDTO;
import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.mapper.UserMapper;
import edu.pict.ecommerce.authservice.model.User;
import edu.pict.ecommerce.authservice.repository.UserRepository;
import edu.pict.ecommerce.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImplementation implements AuthService {
    @Autowired
    UserRepository userRepository;


    @Override
    public User createUser(RegisterDTO registerDTO) {
        return userRepository.save(UserMapper.fromRegisterDTO(registerDTO));
    }

    @Override
    public User validateUser(LoginDTO loginDTO) {
        return null;
    }
}
