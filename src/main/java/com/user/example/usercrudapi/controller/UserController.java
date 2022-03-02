package com.user.example.usercrudapi.controller;

import com.user.example.usercrudapi.entities.User;
import com.user.example.usercrudapi.exceptions.MyException;
import com.user.example.usercrudapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() throws MyException {
        return this.userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable long userId) throws MyException {
        return this.userService.getUserById(userId);
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) throws MyException {
        return this.userService.createUser(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) throws MyException {
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable Long userId) throws MyException {

        this.userService.deleteUser(userId);
    }
}
