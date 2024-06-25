package com.practice.School.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.School.entities.Student;
import com.practice.School.services.StudentService;


@RestController
@RequestMapping("api/Student")
public class StudentController {
    
    @Autowired
    private StudentService service;




    @GetMapping("/allStudents")
    public List<Student> getAllStudents()
    {
        return service.getAllStudents();
    }


    



}
