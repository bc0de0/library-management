package com.shardaspringproject.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shardaspringproject.LibraryManagementSystem.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
