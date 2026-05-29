package com.marekhennig.androidamwcalc;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CalculatorOperationsTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testChainedOperations() {
        calculator.add(10, 5);
        assertEquals(15.0, calculator.getDisplay(), 0.01);
        
        calculator.add(calculator.getDisplay(), 3);
        assertEquals(18.0, calculator.getDisplay(), 0.01);
    }

    @Test
    public void testComplexCalculation() {
        double result = calculator.add(2, 3);
        assertEquals(5.0, result, 0.01);
        
        result = calculator.multiply(result, 2);
        assertEquals(10.0, result, 0.01);
        
        result = calculator.subtract(result, 4);
        assertEquals(6.0, result, 0.01);
    }

    @Test
    public void testLargeNumbers() {
        double result = calculator.add(999999, 1);
        assertEquals(1000000.0, result, 0.01);
    }

    @Test
    public void testVerySmallNumbers() {
        double result = calculator.add(0.001, 0.002);
        assertEquals(0.003, result, 0.0001);
    }

    @Test
    public void testPrecisionInMultiplication() {
        double result = calculator.multiply(0.1, 0.2);
        assertEquals(0.02, result, 0.0001);
    }
}
