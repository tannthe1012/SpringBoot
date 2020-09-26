package com.example.Book.entity;

public class Book1 {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book1(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
}
