package com.example.Book.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Book.entity.Book1;
import com.example.Book.repository.BookRepository;




@Repository
public class BookRepositoryImpl implements BookRepository{
	@Override
	public List dataBookRepository() {
		List<Book1> list = new ArrayList<Book1>();
		Book1 book1 = new Book1("Tren Duong Bang", 12001);
		Book1 book2 = new Book1("The Gioi Dong Vat", 12002);
		list.add(book1);
		list.add(book2);
		return list;
	}
}
