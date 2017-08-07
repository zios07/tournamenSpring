package com.tournament.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "TPlayer")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long ID;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String favFoot;
	
	private String position;

	private int goals;
	
	private int assists;
	
	@OneToOne
	private Team team;
	
	// GETTERS AND SETTERS 
	
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getFavFoot() {
		return favFoot;
	}

	public void setFavFoot(String favFoot) {
		this.favFoot = favFoot;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	
	
	
}
