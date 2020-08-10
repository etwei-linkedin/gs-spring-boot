package com.example.application;

import com.example.services.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CalculatorControllerTests {

    @Test
    public void testApplyOpPlus() {
        //write at least 5 methods to cover those 4 branches + exception; cover all logic
        Assertions.assertEquals(12, CalculatorService.applyOp("+", 10, 2));
    }

    @Test
    public void testApplyOpMinus() {
        Assertions.assertEquals(8, CalculatorService.applyOp("-", 10, 2));
    }

    @Test
    public void testApplyOpMultiply() {
        Assertions.assertEquals(20, CalculatorService.applyOp("*", 10, 2));
    }

    @Test
    public void testApplyOpDivide() {
        Assertions.assertEquals(10, CalculatorService.applyOp("/", 20, 2));
    }

    @Test
    public void testApplyOpDivideAndRound() {
        Assertions.assertEquals(7, CalculatorService.applyOp("/", 15, 2));
    }

    @Test
    public void testApplyOpDivideByZero() {
        Exception exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            CalculatorService.applyOp("/", 10, 0);
        });
        String expectedMessage = "Cannot divide by 0";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void testrandList() {
        List testList = CalculatorService.randList();
        Assertions.assertEquals(testList.size(), 10);

    }

    @Test
    public void testrandSortedList() {
        List testSortedList = CalculatorService.sortRandList();
        List tmp = new ArrayList(testSortedList);
        Collections.sort(tmp);
        boolean sorted = tmp.equals(testSortedList);
        Assertions.assertTrue(sorted);
    }
}
