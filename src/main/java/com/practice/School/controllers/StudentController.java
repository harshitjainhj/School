package com.practice.School.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.practice.School.entities.Student;
import com.practice.School.exceptions.StudentNotFoundException;
import com.practice.School.services.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/students")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student createdStudent = service.createStudent(student);

		return ResponseEntity.ok(createdStudent);

	}
	@GetMapping
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		
		
		return service.getStudentById(id).orElseThrow(()-> new StudentNotFoundException("Student not found with the id: "+id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student) {
		Optional<Student> updatedStudent = service.updateStudent(id, student);

		return updatedStudent.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {

		service.deleteStudent(id);
	}

}
