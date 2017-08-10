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

import com.tournament.models.Team;
import com.tournament.services.TeamService;

@RestController
@RequestMapping("/teams")
@CrossOrigin
public class TeamController {

	@Autowired
	TeamService teamService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST , 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Team addTeam(@RequestBody Team team) {
		System.out.println(team.toString());
		teamService.addTeam(team);
		return team;
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateTeam(@RequestBody Team team) {
		teamService.updateTeam(team);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteTeam(@PathVariable long id) {
		teamService.deleteTeam(id);
	}
	
	@RequestMapping(method = RequestMethod.GET , 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Team> getTeams() {
		return teamService.getTeams();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET , 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Team getTeam(@PathVariable long id) {
		return teamService.getTeam(id);
	}
	
}
