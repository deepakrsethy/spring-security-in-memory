package com.deepak.spring_security_in_memory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/health")
    public String health() {
        return "OK";
    }
}
