package com.library.service;

import java.util.List;

import com.library.entity.Book;
import com.library.model.BookDTO;



public interface BookService {
	
	public String addBook( Book book);
	public BookDTO updateBook(int id,Book book);
	public BookDTO getBookById(int id);
	public List<BookDTO> getAllBooks();
	public String deleteBookById(int id);
	public void deleteAllBooks();
	
	
	public List<BookDTO> getBookByTitle(String bookTitle);
	public List<BookDTO> getBookByPublication(String bookPublication);
	
	
	BookDTO assignStudentToBook(int id, int studentId);
	

}
