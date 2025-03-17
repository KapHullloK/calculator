package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParameterizedTest {

    CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(20, 14, String.format("%s + %s = %s", 20, 14, 20 + 14)),
                Arguments.of(10, 13, String.format("%s + %s = %s", 10, 13, 10 + 13))
        );
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(20, 14, String.format("%s - %s = %s", 20, 14, 20 - 14)),
                Arguments.of(10, 13, String.format("%s - %s = %s", 10, 13, 10 - 13))
        );
    }


    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(12, 31, String.format("%s * %s = %s", 12, 31, 12 * 31)),
                Arguments.of(10, 13, String.format("%s * %s = %s", 10, 13, 10 * 13))
        );
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(20, 14, String.format("%s / %s = %s", 20, 14, 20 / 14)),
                Arguments.of(100, 13, String.format("%s / %s = %s", 100, 13, 100 / 13))
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    public void checkPlusParams(int a, int b, String expected) {
        String actual = calculatorService.plus(a, b);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    public void checkMinusParams(int a, int b, String expected) {
        String actual = calculatorService.minus(a, b);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    public void checkMultiplyParams(int a, int b, String expected) {
        String actual = calculatorService.multiply(a, b);
        assertEquals(actual, expected);
    }


    @ParameterizedTest
    @MethodSource("divideParams")
    public void checkDivideParams(int a, int b, String expected) {
        String actual = calculatorService.divide(a, b);
        assertEquals(actual, expected);
    }
}
