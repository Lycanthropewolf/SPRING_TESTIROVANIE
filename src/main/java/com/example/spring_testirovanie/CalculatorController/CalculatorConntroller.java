package com.example.spring_testirovanie.CalculatorController;

import com.example.spring_testirovanie.CalculatorService.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorConntroller {
    private final CalculatorService calculatorService=new CalculatorService();

    @GetMapping
    public String greeting (){
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public Integer  plus(@RequestParam("num1") Integer a,@RequestParam("num2")Integer b){
        return this.calculatorService.plus(a,b);
    }
    @GetMapping("/minus")
    public Integer  minus(@RequestParam("num1") Integer a,@RequestParam("num2")Integer b){
        return this.calculatorService.minus(a,b);
    }
    @GetMapping("/multiply")
    public Integer  multiply(@RequestParam("num1") Integer a,@RequestParam("num2")Integer b){
        return this.calculatorService.multiply(a,b);
    }
    @GetMapping("/divide")
    public double  dividde(@RequestParam("num1") Integer a,@RequestParam("num2")Integer b){
        return this.calculatorService.divide(a,b);
    }

}
