package com.example.subject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delete-subjects")
public class DeleteController {
	@DeleteMapping
	 public String delete(@RequestBody List<Long> ids) {
		return String.format("Delete subject id in %s success", ids.toString());
	}
}
