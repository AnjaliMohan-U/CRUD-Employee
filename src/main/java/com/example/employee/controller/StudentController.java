package com.example.employee.controller;

import com.example.employee.service.StudentService;
import com.example.employee.students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @PostMapping("/add")
    List<Student> add(@RequestBody Student newStudent){
        return studentservice.add(newStudent);
    }
    @GetMapping("/get/{rno}")
    Student get(@PathVariable String rno){
        return studentservice.get(rno);
    }
    @GetMapping("/year/{year}")
    List<Student> getSalary(@PathVariable String year){
        return studentservice.getYear(year);
    }
    @DeleteMapping("/delete/{rno}")
    Student delete(@PathVariable String rno){
        return studentservice.delete(rno);
    }
}
