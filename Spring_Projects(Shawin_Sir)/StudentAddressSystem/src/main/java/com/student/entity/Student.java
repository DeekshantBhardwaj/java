package com.student.entity;

import javax.persistence.*;
import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Student_Details")
public class Student 
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@Column(name="Student_name",nullable=false)
	private String StudentName;
	@Column(name="phone_no",nullable=false)
	private long phone;
	@Column(nullable=false)
	private String email;

}

