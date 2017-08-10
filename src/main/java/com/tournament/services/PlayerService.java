package com.tournament.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

	public Player getPlayer(long id) {
		return playerRepository.findOne(id);
	}
	
	public List<Player> getAllPlayers(){
		Iterator<Player> iterator = playerRepository.findAll().iterator();
		List<Player> players = new ArrayList<Player>();
		while(iterator.hasNext()) {
			players.add(iterator.next());
		}
		return players;
	}
	
	public void updatePlayer(Player player) {
		playerRepository.save(player);
	}
	
	public void deletePLayer(long id) {
		playerRepository.delete(id);
	}
	
}