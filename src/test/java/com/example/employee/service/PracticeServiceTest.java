package com.example.employee.service;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class PracticeServiceTest {
    @InjectMocks
    private PracticeService practiceService;

    @Before
    public void before(){
        System.out.println("Before");
    }
    @After
    public void after(){
        System.out.println("After");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Test
    public void sumOfThree(){
        System.out.println("Test1");
        assertEquals(6, practiceService.sum(new int[] {4,1,1}));
    }
}
