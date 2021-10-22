package com.example.employee.controller;

import com.example.employee.employee.Employee;
import com.example.employee.service.EmpModelService;
import com.example.employee.students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmpModelController {

    @Autowired
    private EmpModelService empmodelservice;

    @GetMapping("/getAllEmployess")
    List<Employee> getAll(){
        return empmodelservice.getEmployeeList();
    }

    @GetMapping("/retrieve-by-country")
    List<Employee> retrieveByCountry(){
        return empmodelservice.retrieveByCountry();
    }


}
