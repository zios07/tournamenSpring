package com.tournament.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tournament.models.Player;
import com.tournament.services.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@RequestMapping(
		value="/createPlayer", 
		method = RequestMethod.POST, 
		consumes = MediaType.APPLICATION_JSON_VALUE, 
		produces = MediaType.APPLICATION_JSON_VALUE) 
	
	public Player createPlayer(@RequestBody Player player) {
		
		if(player != null) {
			System.out.println(player.getID());
			System.out.println(player.getFirstName());
			System.out.println(player.getLastName());
			System.out.println(player.getAge());
			System.out.println(player.getAssists());
			System.out.println(player.getFavFoot());
			System.out.println(player.getGoals());

			playerService.createPlayer(player);
			return player;
		}
		return null;
	}
}
