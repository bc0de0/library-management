package com.shardaspringproject.LibraryManagementSystem.Service;

import java.util.List;

import com.shardaspringproject.LibraryManagementSystem.Entity.Book;

public interface BookService {

	List<Book> getAllBooks();

	void addBook(Book book);

}
