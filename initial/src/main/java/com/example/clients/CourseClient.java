package com.example.clients;

import com.example.models.backend.Course;
import com.example.utils.CourseDataParser;
import java.util.Map;


public class CourseClient {

  private final CourseDataParser parser = new CourseDataParser();

  public Course getCourse(long courseId) {
    Map<Long, Course> allCourses = parser.loadAllCourses();

    if (!allCourses.containsKey(courseId)) {
      // TODO: how should you handle this case
      //  maybe log error and throw an exception?
      // for now we are doing nothing
    }

    return allCourses.get(courseId);
  }

  public Course getCourseBySlug(String slug) {
    // TODO: implement it when the data is ready
    return null;
  }
}
