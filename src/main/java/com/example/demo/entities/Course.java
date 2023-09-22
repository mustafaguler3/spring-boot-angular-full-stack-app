package com.example.demo.entities;

import java.util.Objects;

public class Course {

    private Long courseId;
    private String courseName;
    private String courseDuration;
    private String courseDescription;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseId, course.courseId) && Objects.equals(courseName, course.courseName) && Objects.equals(courseDuration, course.courseDuration) && Objects.equals(courseDescription, course.courseDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName, courseDuration, courseDescription);
    }
}
