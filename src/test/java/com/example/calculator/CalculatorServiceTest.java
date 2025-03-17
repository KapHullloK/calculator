package com.example.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorService();
    int num1;
    int num2;
    int num3;
    int numZero;

    @BeforeEach
    void setUp() {
        num1 = 25;
        num2 = 5;
        num3 = 7;
        numZero = 0;
    }

    @Test
    public void plus() {
        String except = calculatorService.plus(num1, num2);
        String actual = String.format("%s + %s = %s", num1, num2, num1 + num2);
        assertEquals(except, actual);

        String except2 = calculatorService.plus(num2, num2);
        String actual2 = String.format("%s + %s = %s", num2, num2, num2 + num2);
        assertEquals(except2, actual2);
    }

    @Test
    public void minus() {
        String except = calculatorService.minus(num1, num2);
        String actual = String.format("%s - %s = %s", num1, num2, num1 - num2);
        assertEquals(except, actual);

        String except2 = calculatorService.minus(num2, num2);
        String actual2 = String.format("%s - %s = %s", num2, num2, num2 - num2);
        assertEquals(except2, actual2);
    }

    @Test
    public void multiply() {
        String except = calculatorService.multiply(num1, num2);
        String actual = String.format("%s * %s = %s", num1, num2, num1 * num2);
        assertEquals(except, actual);

        String except2 = calculatorService.multiply(num2, num2);
        String actual2 = String.format("%s * %s = %s", num2, num2, num2 * num2);
        assertEquals(except2, actual2);
    }

    @Test
    public void divide() {
        String except = calculatorService.divide(num1, num2);
        String actual = String.format("%s / %s = %s", num1, num2, num1 / num2);
        assertEquals(except, actual);

        String except2 = calculatorService.divide(num2, num2);
        String actual2 = String.format("%s / %s = %s", num2, num2, num2 / num2);
        assertEquals(except2, actual2);

        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num2, numZero));
    }


}
