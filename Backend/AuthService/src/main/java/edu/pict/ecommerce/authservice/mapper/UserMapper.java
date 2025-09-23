package edu.pict.ecommerce.authservice.mapper;

import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.model.User;

/**
 * Utility class for mapping between DTOs and domain models related to users.
 */
public class UserMapper {

    /**
     * Converts a {@link RegisterDTO} object to a {@link User} entity.
     *
     * @param dto the RegisterDTO containing user registration information
     * @return a User entity populated with the data from the DTO, or {@code null} if the DTO is null
     */
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
