package com.example.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PaymentStatusService {

    boolean isPaid;

    private static final Map<Integer, Boolean> coursePaymentStatusMap = new HashMap<>();
    public PaymentStatusService() {
        for (int i = 0; i < 10; i++) {
            Random isPaid = new Random(0);
            coursePaymentStatusMap.put(i, isPaid.nextBoolean());
        }
    }
    public boolean getPaymentStatus(long id) {

        return coursePaymentStatusMap.get(id);
    }

}
