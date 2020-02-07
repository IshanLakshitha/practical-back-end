package com.pro.studentRegistration.repository;

import com.pro.studentRegistration.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findById(String id);

    List<Student> findAll();
}
