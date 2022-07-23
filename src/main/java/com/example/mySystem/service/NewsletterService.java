package com.example.mySystem.service;

import com.example.mySystem.exception.NewsletterAlredayExistsException;
import com.example.mySystem.model.Category;
import com.example.mySystem.model.Newsletter;

import java.util.*;

public class NewsletterService {
    Map<Integer, Newsletter> newsletters = new HashMap<>();

    public Newsletter addNewsletter(Newsletter newsletter) {
        if (newsletters.containsKey(newsletter.getId())) throw new NewsletterAlredayExistsException();
        newsletters.put(newsletter.getId(), newsletter);
        return newsletter;
    }

    public Map<String, List<Newsletter>> getNewsletters(List<Category> categories) {
        Map<String, List<Newsletter>> result = new HashMap<>();
        for (Newsletter newsletter : newsletters.values()) {
            Set<Category> newsCategories = newsletter.getCategory();
            for (Category category : categories) {
                if (newsCategories.contains(category)) {
                    if (!result.containsKey(category.getName()))
                        result.put(category.getName(), new ArrayList<>());
                    result.get(category.getName()).add(newsletter);
//                    result.getOrDefault(category.getName(), new ArrayList<>()).add(newsletter);
                }
            }
        }
        return result;
    }
}
