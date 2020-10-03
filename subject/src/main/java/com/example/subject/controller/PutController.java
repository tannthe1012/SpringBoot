package com.example.subject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.subject.entity.Update;


@RestController
@RequestMapping("/put-subjects")
public class PutController {
	
	@PutMapping("{name}") 
	public String update(@PathVariable String name, @RequestBody Update rest) {
		return String.format("Mon hoc %s se co hoc phi la : %s ", name, rest.getTuition());
	}
	
}
