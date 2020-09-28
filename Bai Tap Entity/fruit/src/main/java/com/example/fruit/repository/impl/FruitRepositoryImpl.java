package com.example.fruit.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.fruit.entity.Fruit;
import com.example.fruit.repository.FruitRepository;

@Repository
public class FruitRepositoryImpl implements FruitRepository {
	private EntityManager eManager;
	
	@Autowired
	public FruitRepositoryImpl(EntityManager eManager) {
		this.eManager = eManager;
	}
	
	@Override
	public void save(Fruit fruit) {
		eManager.persist(fruit);	
	}
	
	@Override
	public Fruit find(int maQua) {
		return eManager.find(Fruit.class, maQua);
	}
	
	

}
