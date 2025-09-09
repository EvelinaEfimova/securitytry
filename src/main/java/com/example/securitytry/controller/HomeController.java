package com.example.securitytry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Public Home Page";
    }

    @GetMapping("/user")
    public String user() {
        return "User Page (requires login)";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin Page (requires ADMIN role)";
    }
}
