package edu.pict.ecommerce.authservice.repository;

import edu.pict.ecommerce.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
