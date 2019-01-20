package com.apigateway.service;

import com.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:用户
 */
@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand
    public User login(User user) {
        return restTemplate.postForObject("http://USER-SERVICE/user/login", user, User.class);
    }

    @HystrixCommand
    public boolean verifyToken(String token) {
        return restTemplate.getForObject("http://USER-SERVICE/user/verifyToken?token="+token,Boolean.TYPE);
    }
}