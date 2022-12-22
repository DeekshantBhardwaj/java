package com.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Integer> {
	
	
	@Query("from Book where bookTitle like :s%")
	List<Book>  getBookByTitle(@Param("s") String bookTitle);
	
	
	@Query("from Book where bookPublication like :b%")
	List<Book>  getBookByPublication(@Param("b") String bookPublication);

}
