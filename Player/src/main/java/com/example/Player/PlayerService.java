package com.example.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	private PlayerRepository playerRepository;
	@Autowired
	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository=playerRepository;
	}
	public Player dataService() {
		return playerRepository.DataRepository();
	}
	
}
