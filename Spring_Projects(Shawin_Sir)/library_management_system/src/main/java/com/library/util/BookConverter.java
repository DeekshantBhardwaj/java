package com.library.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.library.entity.Book;
import com.library.model.BookDTO;


@Component
public class BookConverter {
	
	//Converting the BookDTO into Book(entity)
	public Book converterToEntity(BookDTO  bookDTO) {
		
		Book book=new Book();
		if(bookDTO!=null) {
			BeanUtils.copyProperties(bookDTO, book);
		}
		return book;
	}
	
	//Converting the Book(entity) to BookDTO
	public BookDTO convertToBookDTO(Book book) {
		
		BookDTO bookDTO=new BookDTO();
		if(book!=null) {
			BeanUtils.copyProperties(book, bookDTO);
		}
		return bookDTO;
		
	}

}
