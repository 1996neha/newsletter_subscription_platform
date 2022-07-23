package com.example.mySystem;

import com.example.mySystem.controller.Controller;
import com.example.mySystem.model.Category;
import com.example.mySystem.model.Newsletter;
import com.example.mySystem.model.User;
import com.example.mySystem.service.NewsletterService;
import com.example.mySystem.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class MachineCodingApplicationTests {

    @Test
    void testAPI() {
        UserService userService = new UserService();
        User u1 = userService.addUser("user1", 1);
        User u2 = userService.addUser("user1", 2);

        NewsletterService newsletterService = new NewsletterService();
        List<User> users = Arrays.asList(u1, u2);

        Set<Category> categorySet = new HashSet<>();
        Category category1 = new Category("science", 1);
        categorySet.add(category1);
        Category category2 = new Category("technology", 2);
        categorySet.add(category2);

        Newsletter newsletter1 = new Newsletter(1, categorySet, "Latest in tech by John Doe", users, 100.0);
        Newsletter newsletter2 = new Newsletter(2, categorySet, "Old in science by John Doe", users, 200.0);
        newsletterService.addNewsletter(newsletter1);
        newsletterService.addNewsletter(newsletter2);

        Controller controller = new Controller(userService, newsletterService);
        Map<String, List<Newsletter>> finalres = controller.getNewsletters(Arrays.asList(category1, category2));
        System.out.println(finalres);
    }
}
