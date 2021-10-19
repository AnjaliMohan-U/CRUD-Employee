package com.example.employee.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

//
//    @PostMapping("/api/foos")
//    @ResponseBody
//    public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name) {
//        return "ID: " + fooId + " Name: " + name;
//    }
}