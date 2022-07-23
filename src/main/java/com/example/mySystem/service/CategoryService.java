package com.example.mySystem.service;

import com.example.mySystem.exception.CategoryAlreadyExists;
import com.example.mySystem.model.Category;

import java.util.HashMap;
import java.util.Map;

public class CategoryService {
    Map<Integer, Category> categories = new HashMap<>();

    public Category addCategory(Category category) {
        if (categories.containsKey(category.getId())) throw new CategoryAlreadyExists();
        categories.put(category.getId(), category);
        return category;
    }
}
