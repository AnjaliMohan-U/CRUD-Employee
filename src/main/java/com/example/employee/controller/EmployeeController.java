package com.example.employee.controller;

import com.example.employee.model.EmployeeModel;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    List<EmployeeModel> add(@RequestBody EmployeeModel newEmployee){
        return employeeService.add(newEmployee);
    }

    @GetMapping("/get/{id}")
    EmployeeModel get(@PathVariable Integer id){
        return employeeService.get(id);
    }

    @GetMapping("/getSalary/{salary}")
    List<EmployeeModel> getSalary(@PathVariable Integer salary){
        return employeeService.getSalary(salary);
    }

    @DeleteMapping("/delete/{id}")
    EmployeeModel delete(@PathVariable Integer id){
        return employeeService.delete(id);
    }

    @PutMapping("/{id}")
    public EmployeeModel replaceEmployee(@PathVariable int id, @RequestBody EmployeeModel newEmployee){
        return employeeService.replace(id, newEmployee);
    }


}
//@PutMapping("/replace")
//public EmployeeModel replaceEmployee(@RequestBody EmployeeModel newEmployee){
//    return employeeService.replace(newEmployee);
//}

/**
 * PATCH with example
 * Enhance existing employee with Salary
 * Query parameters - https://www.baeldung.com/spring-request-param
 * Explore Header params - https://www.baeldung.com/spring-rest-http-headers
 */
