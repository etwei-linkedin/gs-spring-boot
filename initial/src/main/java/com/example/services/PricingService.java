package com.example.services;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class PricingService {
    //go through constructor
    private static final Map<Integer, Float> coursePriceMap = new HashMap<>();
    public PricingService() {
        for (int i = 0; i < 10; i++) {
            coursePriceMap.put(i, Float.valueOf(i));
        }
    }

    public Float getPricing(long id) {

        return coursePriceMap.get(id);
    }
}
