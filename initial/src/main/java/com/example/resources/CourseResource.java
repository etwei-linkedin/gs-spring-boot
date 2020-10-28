package com.example.resources;

import com.example.services.CourseService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseResource {

    public static final String URL_PREFIX = "/course";
    public final CourseService _courseService;

    @Autowired
    public CourseResource(CourseService courseService) {
        _courseService = courseService;
    }

    @RequestMapping(URL_PREFIX + "/{id}")
    public String getCourseData(@PathVariable("id") long id) throws JsonProcessingException {
        //String cs = new CourseService().getCourse();
        return _courseService.getCourse(id);
    }
}
