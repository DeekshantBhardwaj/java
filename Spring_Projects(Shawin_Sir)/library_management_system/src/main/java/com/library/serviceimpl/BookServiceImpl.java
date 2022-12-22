package com.library.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Book;
import com.library.entity.Student;
import com.library.exception.ResourceNotFoundException;
import com.library.model.BookDTO;
import com.library.repository.BookRepository;
import com.library.repository.StudentRepository;
import com.library.service.BookService;
import com.library.util.BookConverter;


@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private BookConverter bookConverter;
	
	
	@Override
	public String addBook( Book book) {
		String message=null;
		bookRepository.save(book);
		if(book!=null) {
			message="Book details saved successfully";
		}
		return message;
	}
	
	
	@Override
	public BookDTO updateBook(int id, Book book) {
		
		Book existingBook= bookRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Book","ID",id));
		existingBook.setBookTitle(book.getBookTitle());
		existingBook.setBookAuthor(book.getBookAuthor());
		existingBook.setBookPublication(book.getBookPublication());
		existingBook.setBookCategory(book.getBookCategory());
		existingBook.setPrice(book.getPrice());
		bookRepository.save(existingBook);
		return bookConverter.convertToBookDTO(existingBook);
		
		
	}
	
	@Override
	public BookDTO getBookById(int id) {
		Book book=bookRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Book","ID",id));
		return bookConverter.convertToBookDTO(book);
	}
	
	@Override
	public List<BookDTO> getAllBooks(){
		List<Book> books=bookRepository.findAll();
		
		List<BookDTO>  bookDTO= new ArrayList<>();
		for(Book b:books) {
			bookDTO.add(bookConverter.convertToBookDTO(b));
		}
		return bookDTO;
	}
	
	@Override
	public String deleteBookById(int id) {
		String message=null;
		Optional<Book> book=bookRepository.findById(id);
		if(book.isPresent()) {
			bookRepository.deleteById(id);
			message="Book details deleted successfully";
		}
		else {
			message="Book not found";
		}
		return message;
		
	}
	
	@Override
	public void deleteAllBooks(){
		bookRepository.deleteAll();
	}
	
    @Override
	public List<BookDTO> getBookByTitle(String bookTitle){
		List<Book>  books= bookRepository.getBookByTitle(bookTitle);
		List<BookDTO>  bookDTO =new ArrayList<>();
		for(Book b: books) {
			bookDTO.add(bookConverter.convertToBookDTO(b));
		}
		return bookDTO;
		
	}
	
    @Override
	public List<BookDTO>  getBookByPublication(String bookPublication){
		List<Book> books=bookRepository.getBookByPublication(bookPublication);
		List<BookDTO> bookDTO = new ArrayList<>();
		for(Book b1: books) {
			bookDTO.add(bookConverter.convertToBookDTO(b1));
		}
		return bookDTO;
	}
	
	
    @Override
    public BookDTO assignStudentToBook(int id,int studentId) {
    	Book book = bookRepository.findById(id).get();
    	Student student= studentRepository.findById(id).get();
    	book.setStudent(student);
    	bookRepository.save(book);
    	return bookConverter.convertToBookDTO(book);
    }
	
}
