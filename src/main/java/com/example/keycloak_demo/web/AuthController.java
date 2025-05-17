package com.example.keycloak_demo.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AuthController {
    @RequestMapping("/home")
    public String home() {
        return "Hello World!";
    }
}
