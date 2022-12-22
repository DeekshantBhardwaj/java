package com.library.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Student;
import com.library.repository.StudentRepository;
import com.library.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	//@Autowired
	//private StudentConverter  studentConverter;
	
	@Override
	public String addStudent(Student student) {
		
		String message=null;
		studentRepository.save(student);
		if(student!=null) {
			message="Student details saved successfully";
		}
		else {
			message="Student not found";
		}
		return message;
		
		
	}
	
	
	
	

}
