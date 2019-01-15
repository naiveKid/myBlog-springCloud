package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//应用入口
@SpringBootApplication
//开启 zuul
@EnableZuulProxy
//eureka 客户端
@EnableEurekaClient
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    //让这个RestTemplate在请求时拥有客户端负载均衡的能力
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

