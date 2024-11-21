package com.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class CalculatorTest {
 
    Calculator calc = new Calculator();
 
    @Test
    public void testAddition() {
        Assert.assertEquals(calc.add(5, 3), 8);
    }
 
    @Test
    public void testSubtraction() {
        Assert.assertEquals(calc.subtract(5, 3), 2);
    }
 
    @Test
    public void testMultiplication() {
        Assert.assertEquals(calc.multiply(5, 3), 15);
    }
 
    @Test
    public void testDivision() {
        Assert.assertEquals(calc.divide(6, 3), 2.0);
    }
 
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        calc.divide(5, 0);
    }
}
