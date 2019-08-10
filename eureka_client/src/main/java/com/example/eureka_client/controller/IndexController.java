package com.example.eureka_client.controller;

import com.example.eureka_client.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    private static final String URL = "http://user/";

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public User aa() {
        User forObject = restTemplate.getForObject("http://user/user", User.class);
        return forObject;
    }

}
