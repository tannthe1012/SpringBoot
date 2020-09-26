package com.example.Book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class BookRepository {
	public List DataBookRepository() {
		List<Book1> list = new ArrayList<Book1>();
		Book1 book1 = new Book1("Tren Duong Bang", 12001);
		Book1 book2 = new Book1("The Gioi Dong Vat", 12002);
		list.add(book1);
		list.add(book2);
		return list;
	}
}
