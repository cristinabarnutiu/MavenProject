package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

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



}
