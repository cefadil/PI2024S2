package dev.galileu.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.hospital.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    Boolean existsByEmail(String email);
    User findByEmailAndSenha(String email, String senha);
    boolean existsByEmailAndSenha(String email, String senha);

}
