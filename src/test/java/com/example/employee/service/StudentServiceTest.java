package com.example.employee.service;

import com.example.employee.students.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {
    @InjectMocks
    private StudentService studentService;

    @Before
    public void addStudents(){
        Student student1 = new Student("01", "stu1", "cse", "1");
        Student student2 = new Student("02", "stu2", "eee", "1");
        Student student3 = new Student("03", "stu3", "civ", "4");
        Student student4 = new Student("04", "stu4", "civ", "2");
        studentService.add(student1);
        studentService.add(student2);
        studentService.add(student3);
        studentService.add(student4);
    }

    @Test
    public void getStudentByYear(){
        List<Student> students = studentService.getYear("1");
        assertEquals(2, students.size());
        assertEquals("01", students.get(0).getRno());
    }


}
