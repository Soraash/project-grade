package com.ltp.grade_submission.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.grade_submission.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
