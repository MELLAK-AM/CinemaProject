package fr.formation.CinemaProject.models;

public class Movie {

	private String id;
	private String title;
	private int time;
	
	
	public Movie() {
		
	}


	public Movie(String id, String title, int time) {
		super();
		this.id = id;
		this.title = title;
		this.time = time;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}
	
	
	
	
}
