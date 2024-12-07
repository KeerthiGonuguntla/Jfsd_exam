package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepository;

@Component
public class DAO {
	
	@Autowired
	BookRepository repo;
	
	public Book addBook(Book book)
	{
		repo.save(book);
		return book;
	}

}
