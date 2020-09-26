package com.example.Book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Book.entity.Book1;
import com.example.Book.repository.BookRepository;
import com.example.Book.service.BookService;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
	private BookRepository bookRepository;
	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	@Override
	public List<Book1> dataService(){
		return  (List<Book1>) bookRepository.dataBookRepository();
	}
	
	
}
