package edu.pict.ecommerce.authservice.service;

import edu.pict.ecommerce.authservice.dtos.LoginDTO;
import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.model.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthService {
    User createUser(RegisterDTO registerDTO);
    User validateUser(LoginDTO loginDTO);
//    User getUser(@RequestBody User user);
}
