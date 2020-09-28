package com.example.person.repository.Impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.example.person.entity.Person;
import com.example.person.repository.PersonRepository;

@Repository
public class PersonRepositoryImpl implements PersonRepository{
	private EntityManager em;
	public PersonRepositoryImpl(EntityManager em) {
		// TODO Auto-generated constructor stub
		this.em=em;
	}
	
	
	@Override
	public void insert(Person person) {
		em.persist(person);
	}

	
}
