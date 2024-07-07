package com.practice.School.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practice.School.entities.Student;

@Service
public interface StudentService {

	public Student createStudent(Student student);

	public List<Student> getAllStudents();

	public Optional<Student> getStudentById(int id);

	public Optional<Student> updateStudent(int id, Student studentDetails);

	public boolean deleteStudent(int id);
}
