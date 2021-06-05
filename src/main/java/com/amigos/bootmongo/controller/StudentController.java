package com.amigos.bootmongo.controller;

import com.amigos.bootmongo.model.Student;
import com.amigos.bootmongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/listAll")
    public List<Student> listAllStudents(){
        return studentService.fetchAllStudents();
    }
}
