package com.example.services;

import com.example.springboot.Course;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CourseService {
    // go through static modifiers & public/private modifiers for java methods
    public String getCourse(long id) throws JsonProcessingException {
        if(id > 10 || id < 1) {
            throw new IllegalArgumentException("The course id does not exist");
        }
        Float coursePrice = new PricingService().getPricing(id);
        PaymentStatusService.PaymentStatus coursePaymentStatus = new PaymentStatusService().getPaymentStatus(id);
        Course course = new Course("Course1", new Date(), "Mary Sima", id, true, coursePrice, coursePaymentStatus);
        return new ObjectMapper().writeValueAsString(course);
    }
}
