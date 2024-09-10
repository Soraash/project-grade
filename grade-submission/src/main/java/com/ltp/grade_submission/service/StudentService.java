package com.ltp.grade_submission.service;

import java.util.List;
import java.util.Set;

import com.ltp.grade_submission.entity.Course;
import com.ltp.grade_submission.entity.Student;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    Set<Course> getEnrolledCourses(Long id);
}
