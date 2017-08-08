package com.tournament.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tournament.models.Player;
import com.tournament.services.PlayerService;

@RestController
@CrossOrigin
public class PlayerController {

	@Autowired
	PlayerService playerService;

	@RequestMapping(value = "/createPlayer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

	public Player createPlayer(@RequestBody Player player) {

		if (player != null) {
			playerService.createPlayer(player);
			return player;
		}
		return null;
	}

	@RequestMapping(value = "/players", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Player> getPlayer(@RequestParam(required = false) Long id) {
		if (id != null) {
			return Arrays.asList(playerService.getPlayer(id));
		} else {
			return playerService.getAllPlayers();
		}
	}
	
	@RequestMapping(value = "/players/delete/{id}", method = RequestMethod.DELETE, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String deletePlayer(@PathVariable long id) {
		playerService.deletePLayer(id);
		return "Player with ID : "+id+" is deleted";
	}
	
}
