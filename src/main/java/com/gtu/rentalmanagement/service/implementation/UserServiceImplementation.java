package com.gtu.rentalmanagement.service.implementation;

import com.gtu.rentalmanagement.entity.User;
import com.gtu.rentalmanagement.repository.UserRepository;
import com.gtu.rentalmanagement.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;
    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserByEmail(String email){
        return userRepository.findUserByMail(email);
    }

    @Override
    public boolean validateUser(String email, String password) {

        return userRepository.validateCredentials(email, password) == 1;
    }

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;

    }
}
