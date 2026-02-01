package edu.pict.ecommerce.authservice.model;

import edu.pict.ecommerce.authservice.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

@Entity
@Data
@RequiredArgsConstructor
public class User {

    /**
     * Unique identifier for the user.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Unique username for authentication.
     */
    @Column(unique = true, nullable = false)
    private UUID username;

    /**
     * Encrypted password used for authentication.
     */
    @Column(unique = true, nullable = false)
    private String password;

    /**
     * Role of the user (e.g., ADMIN, CUSTOMER).
     */
    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    /**
     * Unique email address of the user.
     */
    @Column(unique = true, nullable = false)
    private String email;

    /**
     * First name of the user.
     */
    @Column(nullable = false)
    private String firstName;

    /**
     * Last name of the user.
     */
    @Column(nullable = false)
    private String lastName;

    /**
     * Unique phone number of the user.
     */
    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Embedded
    private Profile profile;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }
}
