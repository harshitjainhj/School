package com.practice.School.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.School.entities.Student;
import com.practice.School.repos.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentRepository repository;


    @Override
    public Student saveStudent(Student student) {

        return repository.save(student);
      
    }

    @Override
    public List<Student> getAllStudents() {
        return  repository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(int id) {
       return repository.findById(id);
    }

    @Override
    public Student updateStudent(Student student) { 
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        repository.delete(student);
    }
    
}
