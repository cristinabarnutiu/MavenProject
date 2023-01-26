package org.example;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    //private Calculator calculator;

    @BeforeAll
    public static void beforeAllMethod(){
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("Before Each");
        //calculator = new Calculator();
    }

    @Test
    public void checkAddition(){
        Calculator calculator = new Calculator();
        double result = calculator.add(1.00,22.00);
        Assertions.assertEquals(result,23.00);

    }

    @Test
    public void checkMultiplication(){
        Calculator calculator = new Calculator();
        double result = calculator.multiply(1.00,22.00);
        Assertions.assertEquals(result,22.00);

    }

    @AfterEach
    public void afterEachMethod(){
        System.out.println("After Each");
    }

    @AfterAll
    public static void afterAllMethod(){
        System.out.println("After All");
    }



}
