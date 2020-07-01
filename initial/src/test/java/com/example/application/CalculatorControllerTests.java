package com.example.application;

import com.example.resources.CalculatorResource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorControllerTests {

    @Test
    public void testApplyOpPlus() {
        //write at least 5 methods to cover those 4 branches + exception; cover all logic
        Assertions.assertEquals(12, CalculatorResource.applyOp("+", 10, 2));
    }

    @Test
    public void testApplyOpMinus() {
        Assertions.assertEquals(8, CalculatorResource.applyOp("-", 10, 2));
    }

    @Test
    public void testApplyOpMultiply() {
        Assertions.assertEquals(20, CalculatorResource.applyOp("*", 10, 2));
    }

    @Test
    public void testApplyOpDivide() {
        Assertions.assertEquals(10, CalculatorResource.applyOp("/", 20, 2));
    }

    @Test
    public void testApplyOpDivideAndRound() {
        Assertions.assertEquals(7, CalculatorResource.applyOp("/", 15, 2));
    }

    @Test
    public void testApplyOpDivideByZero() {
        Exception exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            CalculatorResource.applyOp("/", 10, 0);
        });
        String expectedMessage = "Cannot divide by 0";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

}
