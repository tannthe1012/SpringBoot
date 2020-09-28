package com.example.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.entity.Person;
import com.example.person.sevice.PersonService;

@RestController
@RequestMapping("/tan")
public class PersonController {
	private PersonService personService;
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	@GetMapping
	public Person insert() {
		Person person = new Person();
		person.setChucVu("Giao Vien");
		person.setName("Tan");
		person.setTuoi(18);
		personService.insert(person);
		return person;
	}
}
