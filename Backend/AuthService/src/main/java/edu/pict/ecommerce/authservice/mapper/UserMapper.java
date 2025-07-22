package edu.pict.ecommerce.authservice.mapper;

import edu.pict.ecommerce.authservice.dtos.LoginDTO;
import edu.pict.ecommerce.authservice.dtos.RegisterDTO;
import edu.pict.ecommerce.authservice.model.User;

public class UserMapper {

    // 1️⃣ RegisterDTO → User
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

    // 2️⃣ User + jwtToken → LoginDTO
    public static LoginDTO toLoginDTO(User user, String jwtToken) {
        if (user == null) return null;

        return new LoginDTO(
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getRole(),
                jwtToken
        );
    }

    // 3️⃣ User → RegisterDTO
    public static RegisterDTO toRegisterDTO(User user) {
        if (user == null) return null;

        RegisterDTO dto = new RegisterDTO();
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword()); // Be careful exposing password like this.
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setEmail(user.getEmail());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setRole(user.getRole());

        return dto;
    }

    // 4️⃣ LoginDTO → User (Password not available in LoginDTO so default empty password)
    public static User fromLoginDTO(LoginDTO dto) {
        if (dto == null) return null;

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setRole(dto.getRole());
        user.setPassword(""); // Caution: JWT doesn't carry passwords.
        user.setPhoneNumber(""); // Optional: leave blank or lookup if needed.

        return user;
    }
}
