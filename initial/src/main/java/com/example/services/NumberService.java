package com.example.services;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NumberService {
    public static final Random RAND = new Random();

    /**
     * @return a random number no larger than 10
     */
    public static int getRand() {
        return RAND.nextInt(10);
    }
}
