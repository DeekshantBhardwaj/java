package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query("from Student where studentName=:e")
	List<Student> getStudentByName(@Param("e") String studentName);
}
