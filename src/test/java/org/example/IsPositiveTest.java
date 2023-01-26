package org.example;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {
    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("Before Each");
    }
    @BeforeAll
    public static void beforeAllMethod(){
        System.out.println("Before All");
    }

    @Test
    public void checkIsPositiveTrue(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(3);
        Assertions.assertTrue(result);
    }

    @Disabled("This test must be skipped")
    @Test
    public void checkIsPositiveFalse(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(-3);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,0,-13,17,256,Integer.MAX_VALUE})
    public void checkIsPositiveTrueParametrized(int number){
        IsPositive result = new IsPositive();
        Assertions.assertTrue(result.isPositive(number));
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
