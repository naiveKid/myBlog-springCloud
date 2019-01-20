package com.apigateway.service;

import com.model.AboutMe;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:关于我
 */
@Service
public class AboutMeService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand
    public AboutMe getAboutMe() {
        return restTemplate.getForObject("http://BLOG-SERVICE/aboutMe/index", AboutMe.class);
    }
}