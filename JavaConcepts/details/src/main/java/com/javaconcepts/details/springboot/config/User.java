package com.javaconcepts.details.springboot.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    Order order;

    String name;
    String email;

    public User() {
        System.out.println("Component default constructor called");
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @PostConstruct
    public void postConstruction() {
        System.out.println("Calling post constructor");
    }
}
