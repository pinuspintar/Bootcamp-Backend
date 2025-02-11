package com.pinuspintar.bootcamp.controller;

import com.pinuspintar.bootcamp.model.User;
import com.pinuspintar.bootcamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class PertemuanKetiga {

    private final UserService userService;

    @Autowired
    public PertemuanKetiga(UserService userService){
        this.userService =userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
