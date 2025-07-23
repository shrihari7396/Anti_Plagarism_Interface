package edu.pict.ecommerce.authservice.mapper;

import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.model.User;

public class UserMapper {

    public static User fromRegisterDTO(RegisterDTO dto) {
        if (dto == null) return null;

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setRole(dto.getRole());

        return user;
    }
}
