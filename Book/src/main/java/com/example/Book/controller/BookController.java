package com.example.Book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book.entity.Book1;
import com.example.Book.service.BookService;

@RestController
@RequestMapping("/tan1")
public class BookController {
	private BookService bookService;
	@Autowired
	public BookController(BookService bookService) {
		this.bookService=bookService;
	}
	
	@GetMapping
	public List<Book1> dataController() {
		return (List<Book1>) bookService.dataService();
	}
}
