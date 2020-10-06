package com.example.web_project.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.web_project.model.CreateStudentRequest;
import com.example.web_project.model.Student;

public interface StudentService {
	public void insert(Student s);
}
