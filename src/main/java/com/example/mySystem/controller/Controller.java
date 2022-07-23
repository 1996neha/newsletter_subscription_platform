package com.example.mySystem.controller;

import com.example.mySystem.model.Category;
import com.example.mySystem.model.Newsletter;
import com.example.mySystem.model.User;
import com.example.mySystem.service.NewsletterService;
import com.example.mySystem.service.UserService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class Controller {

    UserService userService;
    NewsletterService newsletterService;

    public User addUser(String name, Integer id) {
        return userService.addUser(name, id);

    }

    public Map<String, List<Newsletter>> getNewsletters(List<Category> categories) {
        return newsletterService.getNewsletters(categories);
    }
}
