package com.springsecurity.telusko.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sendHelloResponse() {
        return "Hello Spring Security adding";
    }
}
