package com.student.repoiestary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;

public interface StudentRepoistary extends JpaRepository<Student,Integer>
{

}
