package com.tournament.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "TTeam")
public class Team {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long ID;
	
	private String teamLabel;
	
	private String teamAbbreviation;
	
	private String country;
	
	@OneToMany
	private List<Player> players;
	
	@ManyToOne
	private Group group;
	
	private int points;

	
	// GETTERS AND SETTERS
	
	
	public long getID() {
		return ID;
	}	

	public void setID(long iD) {
		ID = iD;
	}

	public String getTeamLabel() {
		return teamLabel;
	}

	public void setTeamLabel(String teamLabel) {
		this.teamLabel = teamLabel;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getTeamAbbreviation() {
		return teamAbbreviation;
	}

	public void setTeamAbbreviation(String teamAbbreviation) {
		this.teamAbbreviation = teamAbbreviation;
	}
	
	
	
}	
