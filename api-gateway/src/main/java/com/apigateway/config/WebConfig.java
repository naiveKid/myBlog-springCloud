package com.apigateway.config;

import com.apigateway.config.locale.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig  implements WebMvcConfigurer {

    @Bean
    public org.springframework.web.servlet.LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

    /**
     * 增加url对应的view,直接返回视图逻辑名
     *
     * @param registry
     */
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/web/index");
    }
}
