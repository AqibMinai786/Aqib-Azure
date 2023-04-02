package com.nagarro.aqib.Library.Management.System.service;

import java.util.List;

import com.nagarro.aqib.Library.Management.System.entity.Book;

public interface BookService {
	
	List<Book> getAllBooks();
	
	Book saveBook(Book book);
	
	Book getBookById(Long bookCode);
	Book updateBook(Book book);
	
	void deleteBookById(Long id);
	
}
