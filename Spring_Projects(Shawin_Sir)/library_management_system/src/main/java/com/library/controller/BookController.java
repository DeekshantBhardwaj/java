package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Book;
import com.library.model.BookDTO;
import com.library.service.BookService;
import com.library.util.BookConverter;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookConverter bookConverter;
	
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody BookDTO bookDTO) {
		final Book book= bookConverter.converterToEntity(bookDTO);
		return bookService.addBook(book);
		
	}
	
	@PutMapping("/updateBook/{identity}")
	public BookDTO updateBook(@PathVariable("identity") int id, @RequestBody BookDTO bookDTO) {
		Book book1=bookConverter.converterToEntity(bookDTO);
		return bookService.updateBook(id, book1);
	}
	
	@GetMapping("/getBookById/{id}")
	public BookDTO getBookById(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}
	
	
	@GetMapping("/getAllBooks")
	public List<BookDTO>  getAllBooks(){
		return bookService.getAllBooks();
	}
	
	
	@DeleteMapping("/deleteBookById/{id}")
	public String deleteBookById(@PathVariable("id") int id) {
		return bookService.deleteBookById(id);
	}
	
	@DeleteMapping("/deleteAllBooks")
	public ResponseEntity<String>  deleteAllBooks(){
		bookService.deleteAllBooks();
		return new ResponseEntity<String>("All books details "+"have been deleted ",HttpStatus.OK);
	}
	
	
	//Custom methods Mapping
    @GetMapping("/getBookByTitle/{title}")
	public List<BookDTO>  getBookByTitle(@PathVariable("title") String bookTitle){
		return bookService.getBookByTitle(bookTitle);
		
	}
    
    @GetMapping("/getBookByPublication/{publication}")
    public List<BookDTO> getBookByPublication(@PathVariable("publication") String bookTitle){
    	return bookService.getBookByPublication(bookTitle);
    }
    
    
    @PostMapping("/assignStudentToBook/{bookId}/{studentId}")
    public BookDTO assignStudentToBook(@PathVariable("bookId") int id, @PathVariable("studentId") int studentId) {
    	return bookService.assignStudentToBook(id, studentId);
    }
}
