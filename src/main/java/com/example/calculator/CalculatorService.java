package com.example.calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return String.format("%s + %s = %s", num1, num2, num1 + num2);
    }

    public String minus(int num1, int num2) {
        return String.format("%s - %s = %s", num1, num2, num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return String.format("%s * %s = %s", num1, num2, num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return String.format("%s / %s = %s", num1, num2, num1 / num2);
    }
}
