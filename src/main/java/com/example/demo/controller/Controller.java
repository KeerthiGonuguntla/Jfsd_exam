package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.service.DAO;


@RestController
public class Controller {

	@Autowired
	DAO dao;
	
	
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book)
	{
		return dao.addBook(book);
	}
}
