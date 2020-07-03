package com.example.application;

import com.example.services.NumberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NumberControllerTests {

    @Test
    public void testgetRand() {
        Integer testInt = NumberService.getRand();
        Assertions.assertNotNull(testInt);
    }
}
