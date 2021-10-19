package com.example.employee.service;

import com.example.employee.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<EmployeeModel> employees;

    public List<EmployeeModel> add(EmployeeModel employeeModel) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employeeModel);
        return employees;
    }

    public EmployeeModel replace(int id, EmployeeModel newEmp) {

        boolean flag=false;
        for(EmployeeModel e : employees){
            if (e.getId() == id) {
                System.out.println("Equal");
                System.out.println(e.getId());
                e.setName(newEmp.getName());
                e.setDesignation(newEmp.getDesignation());
                e.setSalary(newEmp.getSalary());
                flag=true;

            }
        }
        if(flag== false){
            System.out.println("notEqual");
            employees.add(newEmp);
        }
        return employees.stream().filter(e-> e.getId()==id).findFirst().get();
    }

    public EmployeeModel get(int id) {
        Optional<EmployeeModel> first = employees.stream().filter(employeeModel -> employeeModel.getId() == id).findFirst();
        return first.isPresent() ? first.get() : null;
    }

    public List<EmployeeModel> getSalary(int salary) {
        List<EmployeeModel> emp = employees.stream().filter(employeeModel -> employeeModel.getSalary() >=salary).collect(Collectors.toList());
        return emp;
    }

    public EmployeeModel delete(int id) {
        Optional<EmployeeModel> first = employees.stream().filter(employeeModel -> employeeModel.getId() == id).findFirst();
        first.ifPresent(employeeModel -> employees.remove(employeeModel));
        return null;
    }

}

//    public List<EmployeeModel> replace(EmployeeModel newEmp) {
//        employees.stream()
//                .forEach(e -> {
//                    if (e.getId() == newEmp.getId()) {
//                        e.setName(newEmp.getName());
//                        e.setDesignation(newEmp.getDesignation());
//                        e.setSalary(newEmp.getSalary());
//                    } else {
//                        employees.add(newEmp);
//                    }
//                });
//        return employees;
//    }



