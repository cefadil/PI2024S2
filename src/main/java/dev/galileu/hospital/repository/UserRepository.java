package dev.galileu.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.hospital.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByUsernameOrEmail(String username, String email);
    List<User> findByIdIn(List<Long> userIds);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    User findByUsernameAndPassword(String username, String password);

}
