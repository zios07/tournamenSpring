package com.tournament.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MatchDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idDetails;
	
	@OneToOne
	private Team winner;
	
	@OneToOne
	private Player manOfTheMatch;
	
	private String score;

	
	
	// GETTERS AND SETTERS
	
	
	public Long getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(Long idDetails) {
		this.idDetails = idDetails;
	}

	public Team getWinner() {
		return winner;
	}

	public void setWinner(Team winner) {
		this.winner = winner;
	}

	public Player getManOfTheMatch() {
		return manOfTheMatch;
	}

	public void setManOfTheMatch(Player manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	
	
}
