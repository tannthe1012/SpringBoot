package com.example.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tan")
public class PlayerController {
	private PlayerService playerService;
	@Autowired
	public PlayerController(PlayerService playerService) {
		this.playerService=playerService;
	}
	@GetMapping
	public Player dataController() {
		return playerService.dataService();
	}
}
