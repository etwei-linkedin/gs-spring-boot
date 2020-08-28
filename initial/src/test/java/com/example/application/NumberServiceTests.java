package com.example.application;

import com.example.services.NumberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NumberServiceTests {

    @Test
    public void testgetRand() {
        Integer testInt = new NumberService().getRand();
        Assertions.assertNotNull(testInt);
    }
}
