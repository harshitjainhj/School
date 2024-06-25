package com.practice.School.services;


import java.util.List;
import com.practice.School.entities.Student;


public interface StudentService {
    
   Student saveStudent(Student student);

   List<Student> getAllStudents();
   
   Student getStudentById(int id );
   
   Student updateStudent(Student student);
   
   void deleteStudent(Student student);








}
