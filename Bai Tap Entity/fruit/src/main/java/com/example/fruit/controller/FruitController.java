package com.example.fruit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fruit.entity.Fruit;
import com.example.fruit.service.FruitService;

@RestController
@RequestMapping("/tan")
public class FruitController {
	
	private FruitService fruitService;
	
	@Autowired
	public FruitController(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	
	@GetMapping("/web/name/{name}/xuatxu/{xuatXu}")
	public Fruit saveFruit(@PathVariable String name, @PathVariable String xuatXu) {
		Fruit fruit = new Fruit();
		fruit.setName(name);
		fruit.setXuatXu(xuatXu);
		fruitService.save(fruit);
		return fruit;
	}
	
	@GetMapping("web/{maQua}")
	public Fruit find(@PathVariable int maQua) {
		return fruitService.find(maQua);
	}
	
}
