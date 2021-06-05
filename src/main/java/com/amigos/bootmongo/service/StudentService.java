package com.amigos.bootmongo.service;

import com.amigos.bootmongo.model.Student;
import com.amigos.bootmongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> fetchAllStudents(){
        return studentRepository.findAll();
    }
}
