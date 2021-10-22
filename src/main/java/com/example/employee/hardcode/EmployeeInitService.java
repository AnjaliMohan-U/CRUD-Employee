package com.example.employee.hardcode;

import com.example.employee.employee.Benefits;
import com.example.employee.employee.Department;
import com.example.employee.employee.Employee;
import com.example.employee.employee.Location;

import java.util.Arrays;
import java.util.List;

public class EmployeeInitService {

        Location loc1 = new Location("I-h1", "hyderabad", "India");
        Location loc2 = new Location("I-c1", "chennai", "India");
        Location loc3 = new Location("UK-l1", "London", "United Kingdom");

        List<Location> locations = Arrays.asList(loc1, loc2, loc3);

        Department d1 = new Department("d1", "health");
        Department d2 = new Department("d2", "finance");
        Department d3 = new Department("d3", "admin");
        Department d4 = new Department("d4", "fraud");

        List<Department> depts = Arrays.asList(d1, d2, d3, d4);

        Benefits b1 = new Benefits("b1", "health benefit", "All the members of employee family will get concession");
        Benefits b2 = new Benefits("b2", "finance benefit", "will get personal loans");
        Benefits b3 = new Benefits("b3", "Home benefit", "employee will get housing loan");
        Benefits b4 = new Benefits("b4", "education benefit", "employee will get education loan");

        List<Benefits> bn1 = Arrays.asList(b4, b3);
        List<Benefits> bn2 = Arrays.asList(b1, b2);
        List<Benefits> bn3 = Arrays.asList(b3, b2);
        List<Benefits> bn4 = Arrays.asList(b2, b3);

        Employee emp1 = new Employee("e1", "ram", 50000, "I-h1", "d1", bn2);
        Employee emp2 = new Employee("e2", "sitha", 65000, "UK-l1", "d4", bn1);
        Employee emp3 = new Employee("e3", "laxman", 47000, "I-c1", "d3", bn3);
        Employee emp4 = new Employee("e4", "bharath", 43000, "I-h1", "d3", null);
        Employee emp5 = new Employee("e5", "shatrugna", 100000, "UK-l1", "d2", null);
        Employee emp6 = new Employee("e6", "bhima", 4000, "I-h1", "d1", null);
        Employee emp7 = new Employee("e7", "surya", 3000, "I-hc1", "d4", null);

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);

        public List<Employee> getAllEmployees(){
            return employees;
        }

}
