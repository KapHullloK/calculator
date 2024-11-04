package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "")
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divide(num1, num2);
    }

}
