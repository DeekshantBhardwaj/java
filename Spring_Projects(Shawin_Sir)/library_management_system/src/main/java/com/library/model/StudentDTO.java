package com.library.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
	
	private int studentId;
	
	@NotNull
	@Size(min=1)
	private String name;
	
	@NotNull
	@Size(min=1)
	private int phone;
	
	@NotNull
	@Size(min=1)
	private String email;
	
	@NotNull
	@Size(min=1)
	private String Branch;
	
	@NotNull
	@Size(min=1)
	private int year;


}
