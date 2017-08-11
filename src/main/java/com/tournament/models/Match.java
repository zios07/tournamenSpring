package com.tournament.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "TMatch")
public class Match {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long ID;
	
	private String label;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@OneToOne
	private Team teamA;
	
	@OneToOne
	private Team teamB;
	
	
	protected static int nb = 1;
	
	@PrePersist
	protected void ensureMatchLabel() {
		this.setLabel("Match "+nb);
		nb++;
	}
	
	
	// GETTERS AND SETTERS
	
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Team getTeamA() {
		return teamA;
	}

	public void setTeamA(Team teamA) {
		this.teamA = teamA;
	}

	public Team getTeamB() {
		return teamB;
	}

	public void setTeamB(Team teamB) {
		this.teamB = teamB;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
