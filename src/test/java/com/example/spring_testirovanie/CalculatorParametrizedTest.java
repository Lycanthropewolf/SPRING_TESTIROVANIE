package com.example.spring_testirovanie;

import com.example.spring_testirovanie.CalculatorService.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorParametrizedTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldEqualWhenPlusThem(Integer input1, Integer input2) {
        Assertions.assertEquals(calculatorService.plus(input1, input2), input1 + input2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldEqualWhenMinusThem(Integer input1, Integer input2) {
        Assertions.assertEquals(calculatorService.minus(input1, input2), input1 - input2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldEqualWhenMultiplyThem(Integer input1, Integer input2) {
        Assertions.assertEquals(calculatorService.multiply(input1, input2), input1 * input2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldEqualWhenDivideThem(Integer input1, Integer input2) {
        Assertions.assertEquals(calculatorService.divide(input1, input2), (double) input1 / input2);
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(Arguments.of(8, 9), Arguments.of(5, 16));
    }

    public static Stream<Arguments> provideIncorrectParams() {
        return Stream.of(
                Arguments.of(null, 9),
                Arguments.of(1, null),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIncorrectParams")
    public void shouldThrowIllegalArgumentException(Integer input1, Integer input2) {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculatorService.plus(input1, input2));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculatorService.minus(input1, input2));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculatorService.multiply(input1, input2));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculatorService.divide(input1, input2));
    }
}
