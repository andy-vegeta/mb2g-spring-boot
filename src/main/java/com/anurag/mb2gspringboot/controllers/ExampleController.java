package com.anurag.mb2gspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class ExampleController {

    @GetMapping
    public Map<String, Object> getIndex() {
        return Map.of("hello", "world");
    }

}