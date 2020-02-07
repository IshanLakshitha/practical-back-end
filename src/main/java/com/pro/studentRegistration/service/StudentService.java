package com.pro.studentRegistration.service;

import com.pro.studentRegistration.models.Student;
import com.pro.studentRegistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(String id, Student studentNewDetails){
        Student student = studentRepository.findById(id);
        Student updatedStudent = new Student();
        if(student!=null){
            studentNewDetails.setId(student.getId());
            updatedStudent = studentRepository.save(studentNewDetails);
        }
        else{
            System.out.println("Resource not found exception!");
        }
        return updatedStudent;
    }

    public Student getStudentById(String id){
        return studentRepository.findById(id);
    }
}
