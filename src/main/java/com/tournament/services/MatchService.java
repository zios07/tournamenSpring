package com.tournament.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tournament.models.Match;
import com.tournament.repositories.MatchRepository;

@Service
public class MatchService {
	
	@Autowired
	MatchRepository matchRepository;
	
	public void addMatch(Match match) {
		matchRepository.save(match);
	}

	public Match getMatch(long id) {
		return matchRepository.findOne(id);
	}
	
	public List<Match> getMatchs() {
		return (List<Match>) matchRepository.findAll();
	}

	public void updateMatch(Match match) {
		matchRepository.save(match);		
	}
	
}
