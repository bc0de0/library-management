package com.shardaspringproject.LibraryManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shardaspringproject.LibraryManagementSystem.Entity.Book;
import com.shardaspringproject.LibraryManagementSystem.Repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository repository;

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public void addBook(Book book) {
		repository.save(book);
	}

}
