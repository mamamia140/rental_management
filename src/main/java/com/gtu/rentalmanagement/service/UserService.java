package com.gtu.rentalmanagement.service;

import com.gtu.rentalmanagement.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findById(Long id);

    User saveUser(User user);

    List<User> findAllUsers();
}
