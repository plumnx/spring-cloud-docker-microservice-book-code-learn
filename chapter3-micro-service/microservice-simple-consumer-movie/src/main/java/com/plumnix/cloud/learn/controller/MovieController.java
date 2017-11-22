package com.plumnix.cloud.learn.controller;

import com.plumnix.cloud.learn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("user.userServiceUrl")
    private String userServiceUrl;

    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://127.0.0.1:8000/" + id, User.class);
    }

    @GetMapping("user2/{id}")
    public User findById2(@PathVariable Long id) {
        return restTemplate.getForObject(userServiceUrl + id, User.class);
    }

}
