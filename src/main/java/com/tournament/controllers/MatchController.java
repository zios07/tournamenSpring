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

import com.tournament.models.Match;
import com.tournament.services.MatchService;

@RestController
@RequestMapping("/matchs")
@CrossOrigin
public class MatchController {
	
	@Autowired
	MatchService matchService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Match> getMatchs(){
		return matchService.getMatchs();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Match getMatch(@PathVariable long id){
		return matchService.getMatch(id);
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addMatch(@RequestBody Match match){
		matchService.addMatch(match);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateMatch(@RequestBody Match match){
		matchService.updateMatch(match);
	}
	
}
