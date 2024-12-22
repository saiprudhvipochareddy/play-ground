package com.javaconcepts.details.springboot.config;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {

    public Order() {
        System.out.println("Order constructor lazy initialize");
    }
}
