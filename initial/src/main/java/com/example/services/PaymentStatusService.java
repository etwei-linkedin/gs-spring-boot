package com.example.services;

import java.util.*;

public class PaymentStatusService {
    // payment_status service (id, user_id, boolean is_paid, expiration_date(null or set a date if is_paid is true))
    public enum PaymentStatus {
        PAID,
        UNPAID,
        PENDING;
    }

    private static final PaymentStatus[] VALUES = PaymentStatus.values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    private static final Map<Integer, PaymentStatus> coursePaymentStatusMap = new HashMap<>();

    public Map PaymentStatusService() {
        for (int i = 0; i < 10; i++)
            coursePaymentStatusMap.put(i, VALUES[RANDOM.nextInt(SIZE)]);
        return coursePaymentStatusMap;
    }

    public PaymentStatus getPaymentStatus(long id) {

        return coursePaymentStatusMap.get(id);
    }
}