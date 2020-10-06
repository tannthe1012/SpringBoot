package com.example.web_project.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.web_project.model.CreateStudentRequest;
import com.example.web_project.model.Student;
import com.example.web_project.repository.StudentRepository;
@Repository
public class StudentRepositoryImpl implements StudentRepository{
	private EntityManager em;

	@Autowired
	public StudentRepositoryImpl(EntityManager em) {
		this.em = em;
	}
	@Override
	public void insert(Student s) {
		em.persist(s);
	}
}
