package com.example.services;

import com.example.springboot.Course;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CourseService {
    public String getCourse(long id) throws JsonProcessingException {
        Course course = new Course("Course1", new Date(), "Mary Sima", id, true, 50f);
        return new ObjectMapper().writeValueAsString(course);
    }
}
