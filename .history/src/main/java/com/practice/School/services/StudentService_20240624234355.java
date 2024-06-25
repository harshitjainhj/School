package com.practice.School.services;


import java.util.List;
import java.util.Optional;

import com.practice.School.entities.Student;


public interface StudentService {
    
   Student saveStudent(Student student);

   List<Student> getAllStudents();
   
   Optional<Student> getStudentById(int id );
   
   Student updateStudent(Student student);
   
   void deleteStudent(Student student);








}
