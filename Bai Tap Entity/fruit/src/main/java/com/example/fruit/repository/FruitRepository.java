package com.example.fruit.repository;

import com.example.fruit.entity.Fruit;

public interface FruitRepository {
	public void save(Fruit fruit);
	public Fruit find(int maQua);
}

