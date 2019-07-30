package com.example.eureka_client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping
    public void aa() {
        List<String> services = client.getServices();
    }

}
