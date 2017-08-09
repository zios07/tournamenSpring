package com.tournament.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tournament.models.Team;
import com.tournament.repositories.TeamRepository;

@Repository
public class TeamService {
	
	@Autowired
	TeamRepository teamRepository;

	public Team addTeam(Team team) {
		teamRepository.save(team);
		return team;
	}
	
	public void deleteTeam(long id) {
		teamRepository.delete(id);
	}
	
}
