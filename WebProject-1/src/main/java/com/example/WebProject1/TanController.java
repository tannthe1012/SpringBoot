package com.example.WebProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webproject1")
public class TanController {
	private TanService service;
	@Autowired
	public TanController (TanService service) {
		this.service = service;
	}
	@GetMapping
	public String getController() {
		return service.getService();
//		return "tan";
	}

}
