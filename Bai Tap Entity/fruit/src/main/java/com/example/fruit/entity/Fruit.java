package com.example.fruit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maQua;
	private String name;
	private String xuatXu;
	
	public int getMaQua() {
		return maQua;
	}
	
	public void setMaQua(int maQua) {
		this.maQua = maQua;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	
	
}
