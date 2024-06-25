package com.practice.School.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.School.entities.Student;
import com.practice.School.repos.StudentRepository;

@Service
public class StudentService {

   @Autowired
   private StudentRepository repository;

  
  public Student saveStudent(Student student) {

      return repository.save(student);
    
  }


  public List<Student> getAllStudents() {
      return  (List<Student>) repository.findAll();
  }


  public Optional<Student> getStudentById(int id) {
     return repository.findById(id);
  }


  public Student updateStudent(Student student) { 
      return repository.save(student);
  }


  public void deleteStudent(Student student) {
      repository.delete(student);
  }
  
} 
