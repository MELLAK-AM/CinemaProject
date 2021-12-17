package fr.formation.CinemaProject.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Room {
	private String id;
	private int number;
	private int nbOfSeats;
	
	public Room() {
		
	}
	
	public Room(String id, int number, int nbOfSeats) {
		super();
		this.id = id;
		this.number = number;
		this.nbOfSeats = nbOfSeats;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNbOfSeats() {
		return nbOfSeats;
	}

	public void setNbOfSeats(int nbOfSeats) {
		this.nbOfSeats = nbOfSeats;
	}
	
	
	

}
