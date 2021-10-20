package com.example.employee.controller;


import com.example.employee.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    private HelloService helloService;

    @GetMapping("/get-data")
    public String getData() {
        return "Greetings from Spring Boot!" +  helloService.getDetails();
    }

}

//
//    @PostMapping("/api/foos")
//    @ResponseBody
//    public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name) {
//        return "ID: " + fooId + " Name: " + name;
//    }