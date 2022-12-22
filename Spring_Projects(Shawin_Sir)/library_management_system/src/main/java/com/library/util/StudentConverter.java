package com.library.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.library.entity.Student;
import com.library.model.StudentDTO;


@Component
public class StudentConverter {
	
	//convert from StudentDTO to Student(entity)
		public Student convertToStudentEntity(StudentDTO studentDTO) {
			Student student=new Student();
			if(studentDTO!=null) {
				BeanUtils.copyProperties(studentDTO, student);
			}
			return student;
			
		}
		
		//convert from Student(entity) to StudentDTO
		public StudentDTO convertToStudentDTO(Student student) {
			StudentDTO studentDTO=new StudentDTO();
			if(student!=null) {
				BeanUtils.copyProperties(student, studentDTO);
			}
			return studentDTO;
		
			
		}


}
