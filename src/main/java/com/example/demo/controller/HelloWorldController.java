package com.example.demo.controller;

import com.example.demo.model.TextCreate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private final TextCreate textCreate;
    public HelloWorldController(TextCreate textCreate) {
        this.textCreate = textCreate;
    }

    @GetMapping
    public String getHello() {
        return textCreate.create();
    }

}
