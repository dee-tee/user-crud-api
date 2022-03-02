package com.user.example.usercrudapi.services;

import com.user.example.usercrudapi.entities.User;
import com.user.example.usercrudapi.exceptions.MyException;

import java.io.Serializable;
import java.util.List;

public interface UserService {
    User createUser(User user) throws MyException;

    User updateUser(User user);

    List<User> getAllUsers() throws MyException;

    User getUserById(long userId) throws MyException;

    User deleteUser(long userId) throws MyException;
}
