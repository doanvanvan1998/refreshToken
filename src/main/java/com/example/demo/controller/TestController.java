package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/getAll")
    public String getAll(){
        return "get alll";
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
}
