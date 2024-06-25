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

//   to create student
    public Student createStudent(Student student) {

        return repository.save(student);

    }

//    get all students 
    public List<Student> getAllStudents() {
        return (List<Student>) repository.findAll();
    }
    
//    get student by Id
    public Optional<Student> getStudentById(int id) {
        return repository.findById(id);
    }

//    update student
    public Optional<Student> updateStudent(int id, Student studentDetails) {

        Optional<Student> studentOptional = repository.findById(id);

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setName(studentDetails.getName());
            student.setDepartment(studentDetails.getDepartment());
            student.setMarks(studentDetails.getMarks());

            repository.save(student);
            return Optional.of(student);
        } else {
            return Optional.empty();
        }
    }
    
//    delete Student
    public boolean deleteStudent(int id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;

        } else
            return false;
    }

}
