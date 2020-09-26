package com.example.Book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Book.entity.Book1;
@Service
public interface BookService {
	public List<Book1> dataService();
}
