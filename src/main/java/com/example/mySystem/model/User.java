package com.example.mySystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
    Integer id;
    String name;
    //other metadata like email
}
