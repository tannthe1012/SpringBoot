package com.example.subject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.subject.entity.Subject;

@RestController
@RequestMapping("/post-subjects")
public class PostController {
	@PostMapping("/string")
	public String postString(@RequestBody String s) {
		return String.format("So duoc them la : %s", s);
	}
	
	@PostMapping("subject") 
	public String postSubject(@RequestBody Subject s) {
		return String.format("Ten cua mon hoc la : %s \nMa so cua mon hoc la : %s", s.getName(), s.getId());
	}
}
