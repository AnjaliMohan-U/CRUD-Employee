package com.example.employee.controller;
import com.example.employee.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {
    @Mock
    private HelloService helloService;
    @InjectMocks
    private HelloController helloController;

    @Test
    public void testGetDetails() {

        when(helloService.getDetails()).thenReturn("dummy test details");

        String data = helloController.getData();
//        String actualResponse = helloService.getDetails();

        assertEquals("Greetings from Spring Boot!dummy test details", data);
    }
}
