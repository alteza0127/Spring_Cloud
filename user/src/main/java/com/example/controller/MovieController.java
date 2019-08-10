package com.example.controller;

import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    private static final String URL = "http://user/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public User get() {
        User user = new User("aa", 12);
        return user;
    }

}