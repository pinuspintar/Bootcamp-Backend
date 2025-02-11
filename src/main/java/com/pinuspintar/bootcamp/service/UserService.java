package com.pinuspintar.bootcamp.service;

import com.pinuspintar.bootcamp.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserByEmail(String email);
    User createUser(User user);
}
