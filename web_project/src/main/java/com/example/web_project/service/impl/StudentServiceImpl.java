package com.example.web_project.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.web_project.model.CreateStudentRequest;
import com.example.web_project.model.Student;
import com.example.web_project.repository.StudentRepository;
import com.example.web_project.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;
	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@Override
	@Transactional
	public void insert(Student s) {
		studentRepository.insert(s);
	}
}
