package com.practice.School.repos;



import org.springframework.data.jpa.repository.JpaRepository;


import com.practice.School.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

    
} 