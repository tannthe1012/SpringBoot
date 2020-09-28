package com.example.fruit.service;

import java.security.PublicKey;

import com.example.fruit.entity.Fruit;

public interface FruitService {
	public void save(Fruit fruit);
	public Fruit find(int maQua);
}
