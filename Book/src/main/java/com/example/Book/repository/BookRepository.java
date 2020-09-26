package com.example.Book.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Book.entity.Book1;
@Repository
public interface BookRepository {
	public List<Book1> dataBookRepository();
}
