package com.example.sms.service;
   
import java.util.List;

import org.springframework.ui.Model;

import com.example.sms.entity.Student;

public interface StudentService {
	
	 
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Long id ,Student student);
	
	void deleteStudentById(Long id);
	
}