package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class HelloTextCreate implements TextCreate {

    public HelloTextCreate(/*...*/) {

    }

    @Override
    public String create() {
        return "Hello World";
    }
}
