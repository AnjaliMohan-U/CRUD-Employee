package com.example.employee.service;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


@RunWith(MockitoJUnitRunner.class)
public class PracticeServiceTest {

    @InjectMocks
    private PracticeService practiceService;

    int total_employees = 0;

    @Before
    public void setData(){
        System.out.println("total employees Before: "+ this.total_employees);
        this.total_employees = 9;
    }
    @After
    public void after(){
        System.out.println("total employees After: "+ this.total_employees);
        System.out.println(this.total_employees);
    }

    @Test
    public void sumOfThree(){
        System.out.println("Test1");
        assertEquals("HELLO",6, practiceService.sum(new int[] {4,1,1}));
    }

    @Test
    public void testString(){
        String name = "My name is Anjali";
        assertThat(name).as("some of the testcases didn't match")
                .isEqualTo("I am anjali")
                .isEqualToIgnoringCase("I am anjali")
                .startsWith("I")
                .endsWith("!")
                .containsIgnoringCase("anjali");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

}