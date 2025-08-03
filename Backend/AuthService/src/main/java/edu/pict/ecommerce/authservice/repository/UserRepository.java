package edu.pict.ecommerce.authservice.repository;

import edu.pict.ecommerce.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link User} entity.
 * Extends {@link JpaRepository} to provide basic CRUD operations.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * Finds a user by their username.
     *
     * @param username the username to search for
     * @return the user with the specified username, or null if not found
     */
    User findByUsername(String username);
}
