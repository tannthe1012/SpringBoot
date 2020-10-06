package com.example.web_project.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web_project.model.CreateStudentRequest;
import com.example.web_project.model.Student;
import com.example.web_project.service.StudentService;

@RestController
@RequestMapping("/persons")
public class PostController {
	private StudentService studentService;
	@Autowired
	public PostController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PostMapping("post-person")
	public String insert(@RequestBody CreateStudentRequest requestBody) {
		Student s = new Student();
		s.setName(requestBody.getName());
		s.setAge(requestBody.getAge());
		
		studentService.insert(s);
		return "Tan";
	}
	
}
