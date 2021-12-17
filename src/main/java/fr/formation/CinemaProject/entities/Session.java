package fr.formation.CinemaProject.entities;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Session {
	private String id;
	private LocalDateTime date;
	private Movie movie;
	private Room room;
	
	public Session() {
		
	}

	public Session(String id, LocalDateTime date, Movie movie, Room room) {
		super();
		this.id = id;
		this.date = date;
		this.movie = movie;
		this.room = room;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
}
