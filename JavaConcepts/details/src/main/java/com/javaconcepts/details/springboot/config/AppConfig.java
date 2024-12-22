package com.javaconcepts.details.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User createUser() {
        System.out.println("Calling first bean");
        return new User("prudhvi", "prudhvipochareddy@gmail.com");
    }

    @Bean
    public User createUser2() {
        System.out.println("Calling second bean");
        return new User("sai", "saireddy@gmail.com");
    }
}
