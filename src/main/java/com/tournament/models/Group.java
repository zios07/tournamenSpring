package com.tournament.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TGroup")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long ID;
	
	private String label;
	
	// Constructors
	
	public Group() {
		// TODO Auto-generated constructor stub
	}
	
	public Group(long iD, String label) {
		super();
		ID = iD;
		this.label = label;
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
	
}
