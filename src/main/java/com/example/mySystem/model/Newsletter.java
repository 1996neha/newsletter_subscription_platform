package com.example.mySystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class Newsletter {
    Integer id;
    Set<Category> category;
    String title;
    List<User> users;
    Double price;
}
