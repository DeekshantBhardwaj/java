package com.student.util;

import org.springframework.beans.BeanUtils;

import com.student.entity.Student;
import com.student.model.StudentDTO;

public class Convertor
{
	public Student ConverttoEntity(StudentDTO studentDTO)
	{
		Student student= new Student();
		if(studentDTO!=null)
		{
			BeanUtils.copyProperties(studentDTO, student);
		}
		return student;
	}
	//Convert Entity(Studnet) to Studentdto
	public StudentDTO ConvertToStudentDTO(Student student)
	{
		StudentDTO studentdto= new StudentDTO();
		if(student!=null)
		{
		 BeanUtils.copyProperties(student, studentdto);	
		}
		return studentdto;
	}

}
