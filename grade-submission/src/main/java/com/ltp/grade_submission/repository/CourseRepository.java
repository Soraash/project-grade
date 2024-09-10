package com.ltp.grade_submission.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.grade_submission.entity.Course;


public interface CourseRepository extends CrudRepository<Course, Long> {

}
