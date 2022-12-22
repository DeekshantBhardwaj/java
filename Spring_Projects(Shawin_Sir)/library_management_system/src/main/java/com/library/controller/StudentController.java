package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Student;
import com.library.model.StudentDTO;
import com.library.service.StudentService;
import com.library.util.StudentConverter;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@Autowired
	private StudentConverter studentConverter;
	
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody StudentDTO studentDTO) {
		final Student student = studentConverter.convertToStudentEntity(studentDTO);
		return studentService.addStudent(student);
		
	}
	

}
