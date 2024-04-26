package com.difusao.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/")
    public Map<String, Boolean> sayHello() {
        return Map.of("success", true);
    }
}