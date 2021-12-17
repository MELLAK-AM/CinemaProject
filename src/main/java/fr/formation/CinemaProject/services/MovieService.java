package fr.formation.CinemaProject.services;

import java.util.List;
import java.util.Optional;

import fr.formation.CinemaProject.entities.Movie;
import fr.formation.CinemaProject.repositories.MovieRepository;

public class MovieService {
	
	private MovieRepository repository;

	public MovieService(MovieRepository repository) {
		 this.repository = repository;
	}
	
	public List<Movie> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Movie> findById(String id){
		return this.repository.findById(id);
	}
	
	public Movie save(Movie movie) {
		return this.repository.save(movie);
	}
	
	public void delete(Movie movie) {
		this.repository.delete(movie);
	}

}
