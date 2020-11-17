package com.example.services;

import java.util.*;

public class PaymentStatusService {
    // TODO: add the following fields to PaymentStatusService -> Integer user_id, boolean is_paid,
    // TODO: DATETIME expiration_date (null or date if is_paid = true)

    /**
     * All possible payment statuses
     */
    public enum PaymentStatus {
        /**
         * Paid status
         */
        PAID,

        /**
         * UNPAID status
         */
        UNPAID,

        /**
         * Pending status
         */
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

    /**
     * Returns a course id and it's corresponding payment status
     * @param id The id of the course
     * @return a hashmap of each course id and their corresponding payment status
     */
    public PaymentStatus getPaymentStatus(long id) {

        return coursePaymentStatusMap.get(id);
    }
}