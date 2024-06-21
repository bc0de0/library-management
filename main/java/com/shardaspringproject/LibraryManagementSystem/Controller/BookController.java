package com.shardaspringproject.LibraryManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shardaspringproject.LibraryManagementSystem.Entity.Book;
import com.shardaspringproject.LibraryManagementSystem.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/all-books")
	public List<Book> getAllBooks(){
		return service.getAllBooks();
	}
	
	@PostMapping("/new-book")
	public void addBook(@RequestBody Book book) {
		service.addBook(book);
	}

}
