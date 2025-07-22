package edu.pict.ecommerce.authservice.dtos;

import edu.pict.ecommerce.authservice.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private String jwtToken;
}
