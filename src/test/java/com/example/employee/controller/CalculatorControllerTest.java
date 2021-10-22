package com.example.employee.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.employee.service.CalculatorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.security.PublicKey;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {
    private int total_students=0;

    @Mock
    CalculatorService calculatorservice;
    @InjectMocks
    CalculatorController calculatorcontrol;

    @Before
    public void hello(){
        System.out.println("Hi");
    }
    @Test
    public void testAdd(){
        when(calculatorservice.add(10,20)).thenReturn(30);
        Assert.assertEquals(calculatorservice.add(10,20),30);
        verify(calculatorservice).add(10,20);
    }

}
