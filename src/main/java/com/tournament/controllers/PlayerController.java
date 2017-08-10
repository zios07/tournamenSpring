package com.tournament.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tournament.models.Player;
import com.tournament.services.PlayerService;

@RestController
@RequestMapping("/players")
@CrossOrigin
public class PlayerController {

	@Autowired
	PlayerService playerService;

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

	public Player createPlayer(@RequestBody Player player) {

		if (player != null) {
			playerService.createPlayer(player);
			return player;
		}
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Player> getPlayers() {
			return playerService.getAllPlayers();
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Player getPlayer(@PathVariable long id) {
		return playerService.getPlayer(id);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String deletePlayer(@PathVariable long id) {
		playerService.deletePLayer(id);
		return "Player with ID : "+id+" is deleted";
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePlayer(@RequestBody Player player) {
		System.out.println("Update called !");
		playerService.updatePlayer(player);
	}
	
} 
