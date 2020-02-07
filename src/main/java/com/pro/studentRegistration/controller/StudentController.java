package com.pro.studentRegistration.controller;
import com.pro.studentRegistration.models.Student;
import com.pro.studentRegistration.repository.StudentRepository;
import com.pro.studentRegistration.service.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@Valid @RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable(value = "id") String id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable(value = "id") String id, @Valid @RequestBody Student studentNewDetails){
        return studentService.updateStudent(id, studentNewDetails);
    }

}
