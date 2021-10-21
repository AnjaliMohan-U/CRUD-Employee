package com.example.employee.service;

import com.example.employee.students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> students;
    public List<Student> add(Student newStudent) {
        if(students==null){
            students = new ArrayList<>();
        }
        students.add(newStudent);
        return students;
    }

    public Student get(String rno) {
        Optional<Student> studentByRollno = students.stream().filter(student -> student.getRno().equals(rno)).findFirst();
        return studentByRollno.isPresent() ? studentByRollno.get() : null;
    }

    public List<Student> getYear(String year) {
        List<Student> studentsByYear = students.stream().filter(student -> student.getYear().equals(year)).collect(Collectors.toList());
        return studentsByYear;
    }

    public Student delete(String rno) {
        Optional<Student> deletedStudent = students.stream().filter(student -> student.getRno().equals(rno)).findFirst();
        deletedStudent.ifPresent(student -> students.remove(student));
        return null;
    }

}
