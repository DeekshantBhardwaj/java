package com.student.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.model.StudentDTO;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import com.student.util.Converter;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private Converter converter;
	
	@Override
	public String createStudent(Student student) {
		String message=null;
		studentRepository.save(student);
		if(student!=null)
		{
			message="Student details saved successfully";
		}
		return message;
	}

	@Override
	public StudentDTO updateStudent(int id, Student student) {
		Student existingStudent =studentRepository.findById(id).get();
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setPhone(student.getPhone());
		existingStudent.setEmail(student.getEmail());
		
		studentRepository.save(existingStudent);
		
		return converter.convertToStudentDTO(existingStudent);
	}

	@Override
	public StudentDTO getStudentById(int id) {
		Student getS = studentRepository.findById(id).get();
		return converter.convertToStudentDTO(getS);
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		List<Student> students=studentRepository.findAll();
		
		List<StudentDTO> sDTO = new ArrayList<>();
		for(Student s: students)
		{
			sDTO.add(converter.convertToStudentDTO(s));
		}
		return sDTO;
	}

	@Override
	public String deleteStudentById(int id) {
		String message = null;
		Optional<Student> student= studentRepository.findById(id);
		if(student.isPresent())
		{
			studentRepository.deleteById(id);
			message = "Student details deleted successfully";
		}
		else
		{
			message="Student details not found!!";
		}
		return message;
	}

	@Override
	public void deleteAllStudents() {
		studentRepository.deleteAll();
		
	}

	


	
}
