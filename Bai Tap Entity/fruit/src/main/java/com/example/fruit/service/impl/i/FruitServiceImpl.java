package com.example.fruit.service.impl.i;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fruit.entity.Fruit;
import com.example.fruit.repository.FruitRepository;
import com.example.fruit.service.FruitService;
@Service
public class FruitServiceImpl implements FruitService{
	
	private FruitRepository fruitRepository;
	
	@Autowired
	public FruitServiceImpl(FruitRepository fruitRepository) {
		this.fruitRepository = fruitRepository;
	}
	
	@Override
	@Transactional
	public void save(Fruit fruit) {
		fruitRepository.save(fruit);
	}
	@Override
	public Fruit find(int maQua) {
		return fruitRepository.find(maQua);
	}
}
