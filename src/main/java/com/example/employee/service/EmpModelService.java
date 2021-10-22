package com.example.employee.service;

import com.example.employee.employee.Employee;
import com.example.employee.hardcode.EmployeeInitService;

import com.example.employee.hardcode.EmployeeInitService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpModelService {
    List<Employee> employees = new ArrayList<>();
    EmployeeInitService initservice = new EmployeeInitService();

   public List<Employee> getEmployeeList(){
        return initservice.getAllEmployees();
   }

    public List<Employee> retrieveByCountry() {
       return employees.stream().filter(emp-> emp.getLoc_id().startsWith("I")).collect(Collectors.toList());
    }
}
//
//employees.stream().filter(emp -> emp.getLoc_id().startsWith("I")).forEach(emp -> {
//        System.out
//        .println("employee id: " + emp.getEmp_id() + " - " + " employee name: " + emp.getEmp_name() + "\n");