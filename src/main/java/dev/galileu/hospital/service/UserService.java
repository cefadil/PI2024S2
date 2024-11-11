package dev.galileu.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.galileu.hospital.entity.Department;
import dev.galileu.hospital.entity.User;
import dev.galileu.hospital.repository.UserRepository;
import dev.galileu.hospital.utils.Utils;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public User save(User user) {
        user.setSenha(Utils.getMd5(user.getSenha()));
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public User update(long id, User user) {
        User userToUpdate = userRepository.findById(id).orElse(null);
        if (userToUpdate == null) {
            return null;
        }
        userToUpdate.setNome(user.getNome());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setSenha(Utils.getMd5(user.getSenha()));
        userToUpdate.setMatricula(user.getMatricula());
        userToUpdate.setFone(user.getFone());
        userToUpdate.setRole(user.getRole());
        userToUpdate.setDepartment(user.getDepartment());
        return userRepository.save(user);

    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public User findByEmailAndSenha(String email, String senha) {
        return userRepository.findByEmailAndSenha(email, Utils.getMd5(senha));
    }

    public boolean existsByEmailAndSenha(String email, String senha) {
        return userRepository.existsByEmailAndSenha(email, Utils.getMd5(senha));
    }

    public String login(String email, String senha) {
        if (existsByEmailAndSenha(email, senha)) {
            return "Login efetuado com sucesso!";
        }
        return "Email ou senha incorretos!";
    }


    

}
