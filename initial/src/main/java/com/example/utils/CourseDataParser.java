package com.example.utils;

import com.example.models.backend.Course;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;


public class CourseDataParser {

  /**
   *
   * @return
   */
  public Map<Long, Course> loadAllCourses() {
    Map<Long, Course> allCourses = new HashMap<>();
    String file ="src/main/resources/CourseData.txt";

    try {
      BufferedReader reader = new BufferedReader(new FileReader(file));

      String currentLine = reader.readLine();
      while (currentLine != null) {
        String[] elements = currentLine.split(",");
        Course course = createCourse(elements);
        allCourses.put(course.getId(), course);

        currentLine = reader.readLine();
      }
      reader.close();
      return allCourses;
    } catch (Exception e) {
      // TODO: handle the exception
    }

    return new HashMap<>();
  }

  private static Course createCourse(String[] elements) throws ParseException {
    if (elements.length < 5) {
      // TODO: handle invalid data here
    }

    Course course = new Course();
    course.setName(elements[0]);
    course.setPublishDate(new SimpleDateFormat("yyyy-MM-dd").parse(elements[1]));
    course.setAuthor(elements[2]);
    course.setId(Long.parseLong(elements[3]));
    course.setPublic(Boolean.parseBoolean(elements[4]));

    return course;
  }
}
