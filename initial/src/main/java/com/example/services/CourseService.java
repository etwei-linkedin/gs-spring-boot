package com.example.services;

import com.example.springboot.Course;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CourseService {
    // TODO: go through static modifiers & public/private modifiers for java methods

    /**
     * returns course json after calling the PricingService and PaymentStatusService to get these additional fields
     * @param id The course id
     * @return course json as a string
     * @throws JsonProcessingException when course id does not exist
     */
    public String getCourse(long id) throws JsonProcessingException {
        // TODO: autowire the pricing service
        Float coursePrice = new PricingService().getPricing(id);
        PaymentStatusService.PaymentStatus coursePaymentStatus = new PaymentStatusService().getPaymentStatus(id);
        Course course = new Course("Course1", new Date(), "Mary Sima", id, true, coursePrice, coursePaymentStatus);
        return new ObjectMapper().writeValueAsString(course);
    }
}
