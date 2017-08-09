package com.tournament.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tournament.models.Team;
import com.tournament.services.TeamService;

@RestController
@CrossOrigin
public class TeamController {

	@Autowired
	TeamService teamService;
	
	@RequestMapping(value = "/addTeam", method = RequestMethod.POST , 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Team addTeam(@RequestBody Team team) {
		System.out.println(team);
		teamService.addTeam(team);
		return team;
	}
	
	@RequestMapping(value = "/deleteTeam/{id}", method = RequestMethod.DELETE)
	public void deleteTeam(@PathVariable long id) {
		teamService.deleteTeam(id);
	}
}
