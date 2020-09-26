package com.example.Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tan1")
public class BookController {
	private BookService bookService;
	@Autowired
	public BookController(BookService bookService) {
		this.bookService=bookService;
	}
	@GetMapping
	public List<Book1> Data() {
		return (List<Book1>) bookService.DataService();
	}
}
