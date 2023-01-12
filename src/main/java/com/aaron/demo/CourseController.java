package com.aaron.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class CourseController {
    //http://localhost:8080/courses/
//Course: id, name, author
    @RequestMapping("/courses")
    public List<Course> retreiveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Aaron"),
                new Course(2, "Learn DevOps", "in28minutes"),
                new Course(3, "Learn React", "Josh")
        );
    }
}
