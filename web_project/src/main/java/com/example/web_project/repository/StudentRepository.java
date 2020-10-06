package com.example.web_project.repository;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.web_project.model.CreateStudentRequest;
import com.example.web_project.model.Student;

public interface StudentRepository {
	public void insert(Student s);
}
