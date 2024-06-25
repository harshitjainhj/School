package com.practice.School.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.School.entities.Student;
import com.practice.School.services.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public  void createStudent(@RequestBody  Student student )
    {
        service.createStudent(student);
        
    } 


}
