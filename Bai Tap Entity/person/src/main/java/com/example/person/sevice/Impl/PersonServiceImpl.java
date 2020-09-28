package com.example.person.sevice.Impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.entity.Person;
import com.example.person.repository.PersonRepository;
import com.example.person.sevice.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	private PersonRepository personRepository;
	@Autowired
	public PersonServiceImpl(PersonRepository personRepository) {
		// TODO Auto-generated constructor stub
		this.personRepository = personRepository;
	}
	@Override
	@Transactional
	public void insert(Person person) {
		personRepository.insert(person);
	}
	
}
