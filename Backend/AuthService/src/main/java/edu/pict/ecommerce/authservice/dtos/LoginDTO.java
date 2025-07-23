package edu.pict.ecommerce.authservice.dtos;

import edu.pict.ecommerce.authservice.model.enums.Role;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginDTO {
    private String username;
    private String password;
    private Role role;
}
