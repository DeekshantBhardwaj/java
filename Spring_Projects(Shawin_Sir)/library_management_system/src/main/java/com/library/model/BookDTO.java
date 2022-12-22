package com.library.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {
	
	private int id;
	
	@NotNull
	@Size(min=1)
	private String bookTitle;
	
	@NotNull
	@Size
	private String bookAuthor;
	
	@NotNull
	@Size
	private String bookPublication;
	
	@NotNull
	@Size(min=1)
	private String bookCategory;
	
	@NotNull
	@Size(min=1)
	private int price;

}
