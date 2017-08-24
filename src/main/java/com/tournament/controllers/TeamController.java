package com.tournament.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tournament.models.Team;
import com.tournament.services.TeamService;

@RestController
@RequestMapping("/teams")
@CrossOrigin
public class TeamController {

	@Autowired
	TeamService teamService;

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = {"multipart/form-data"}, produces = MediaType.TEXT_PLAIN_VALUE)
	public String addTeam(@RequestPart("teamAvatar") MultipartFile file, 
			@RequestPart("teamDetails") Team team) throws IOException {
		team.setAvatar(file.getBytes());
		teamService.addTeam(team);	
		return "Team added";
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateTeam(@RequestBody Team team) {
		teamService.updateTeam(team);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteTeam(@PathVariable long id) {
		teamService.deleteTeam(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Team> getTeams() {
		return teamService.getTeams();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Team getTeam(@PathVariable long id) {
		return teamService.getTeam(id);
	}

}
