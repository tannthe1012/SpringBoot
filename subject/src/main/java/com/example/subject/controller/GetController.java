package com.example.subject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get-subjects")
public class GetController {
	
	@GetMapping("/get/name/{name}")
	public String getSubject(@PathVariable String name) {
		return String.format("name subject: %s ", name);
	}
	
	@GetMapping("/params")
	public String getSubjectParamString(@RequestParam String name) {
		return String.format("name subject: %s ", name);
	}
}
