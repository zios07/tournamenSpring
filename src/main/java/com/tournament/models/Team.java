package com.tournament.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Team {
	
	@Id
	private long ID;
	
	private String teamLabel;
	
	private String coutry;
	
	@OneToMany
	private List<Player> players;
	
	@OneToOne
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

	public String getCoutry() {
		return coutry;
	}

	public void setCoutry(String coutry) {
		this.coutry = coutry;
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
	
	
	
}	
