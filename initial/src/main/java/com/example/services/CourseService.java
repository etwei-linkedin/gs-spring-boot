package com.example.services;

import com.example.clients.CourseClient;
import com.example.models.api.Course;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseService {
    // TODO: this needs to be auto-wired
    private final CourseClient _courseClient = new CourseClient();

    // TODO: go through static modifiers & public/private modifiers for java methods

    /**
     * returns course json after calling the PricingService and PaymentStatusService to get these additional fields
     * @param id The course id
     * @return course json as a string
     * @throws JsonProcessingException when course id does not exist
     */
    public String getCourse(long id) throws JsonProcessingException {

        com.example.models.backend.Course backendCourse = _courseClient.getCourse(id);

        // TODO: autowire the pricing service
        Float coursePrice = new PricingService().getPricing(id);
        PaymentStatusService.PaymentStatus coursePaymentStatus = new PaymentStatusService().getPaymentStatus(id);

        Course apiCourse = buildApiCourse(backendCourse, coursePaymentStatus, coursePrice);
        return new ObjectMapper().writeValueAsString(apiCourse);
    }

    private Course buildApiCourse(com.example.models.backend.Course backendCourse, PaymentStatusService.PaymentStatus paymentStatus, Float price) {
        Course apiCourse = new Course();

        apiCourse.setId(backendCourse.getId());
        apiCourse.setName(backendCourse.getName());
        apiCourse.setPublishDate(backendCourse.getPublishDate());
        apiCourse.setPublic(backendCourse.isPublic());
        apiCourse.setAuthor(backendCourse.getAuthor());
        apiCourse.setPrice(price);
        apiCourse.setCoursePaymentStatus(paymentStatus);

        return apiCourse;
    }
}
