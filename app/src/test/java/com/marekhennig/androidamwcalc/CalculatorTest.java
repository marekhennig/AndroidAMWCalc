package com.marekhennig.androidamwcalc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        double result = calculator.add(5, 3);
        assertEquals(8.0, result, 0.01);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        double result = calculator.add(-5, 3);
        assertEquals(-2.0, result, 0.01);
    }

    @Test
    public void testSubtraction() {
        double result = calculator.subtract(10, 3);
        assertEquals(7.0, result, 0.01);
    }

    @Test
    public void testSubtractionWithNegativeResult() {
        double result = calculator.subtract(3, 10);
        assertEquals(-7.0, result, 0.01);
    }

    @Test
    public void testMultiplication() {
        double result = calculator.multiply(4, 5);
        assertEquals(20.0, result, 0.01);
    }

    @Test
    public void testMultiplicationByZero() {
        double result = calculator.multiply(4, 0);
        assertEquals(0.0, result, 0.01);
    }

    @Test
    public void testDivision() {
        double result = calculator.divide(20, 4);
        assertEquals(5.0, result, 0.01);
    }

    @Test
    public void testDivisionWithDecimal() {
        double result = calculator.divide(10, 3);
        assertEquals(3.33, result, 0.01);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }

    @Test
    public void testClear() {
        calculator.setDisplay(123.45);
        calculator.clear();
        assertEquals(0.0, calculator.getDisplay(), 0.01);
    }
}
