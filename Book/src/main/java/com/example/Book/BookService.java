package com.example.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
	private BookRepository bookRepository;
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	public List<Book1> DataService(){
		return  (List<Book1>) bookRepository.DataBookRepository();
	}
}
