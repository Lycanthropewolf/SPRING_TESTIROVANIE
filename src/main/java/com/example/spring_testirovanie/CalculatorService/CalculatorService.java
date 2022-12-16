package com.example.spring_testirovanie.CalculatorService;

import org.springframework.stereotype.Service;

@Service
public class  CalculatorService {
    public String greeting( ) {
        return "добро пожаловать в калькулятор";
    }

    public Integer  plus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("ввведите параметры");
        }
        return a + b;
    }

    public Integer  minus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("ввведите параметры");
        }
        return a - b;
    }

    public Integer  multiply(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("ввведите параметры");
        }
        return a * b;
    }

    public double  divide(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("ввведите параметры");
        }
        if (b == 0) {
            throw new IllegalArgumentException("на ноль делить нельзя");
        }
        return (double) a / b;
    }
}
