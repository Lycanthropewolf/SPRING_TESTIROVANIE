package com.example.spring_testirovanie.CalculatorService;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String greeting() {
        return "добро пожаловать в калькулятор";
    }

    public Integer plus(Integer a, Integer b) {
        checkParams(a, b);
        return a + b;
    }

    public Integer minus(Integer a, Integer b) {
        checkParams(a, b);
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        checkParams(a, b);
        return a * b;
    }

    public double divide(Integer a, Integer b) {
        checkParams(a, b);
        if (b == 0) {
            throw new IllegalArgumentException("на ноль делить нельзя");
        }
        return (double) a / b;
    }

    private void checkParams(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметры правильно");
        }
    }
}
