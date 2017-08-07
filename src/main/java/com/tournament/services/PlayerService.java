package com.tournament.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tournament.models.Player;
import com.tournament.repositories.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository playerRepository;
	
	public Player createPlayer(Player player) {
		playerRepository.save(player);
		return player;
	}
	
}