package com.tournament.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tournament.models.Team;

public class MapperTest {
	
	public static void main(String[] args) {
		
		String damagedJson = "{\"teamLabel\":\"ddghhg\",\"teamAbbreviation\":\"ytdghy\",\"group\":{\"label\":\"B\",\"id\":14},\"country\":\"Portugal\"}";
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Team team = mapper.readValue(damagedJson, Team.class);
			
			System.out.println(team.getTeamLabel());
			System.out.println(team.getTeamAbbreviation());
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
