package com.example.mySystem.service;

import com.example.mySystem.exception.UserAlredayExistsException;
import com.example.mySystem.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    Map<Integer, User> users = new HashMap<>();

    public User addUser(String name, Integer id) {
        if (users.containsKey(id)) throw new UserAlredayExistsException();
        User user = new User(id, name);
        users.put(user.getId(), user);
        return user;
    }
}
