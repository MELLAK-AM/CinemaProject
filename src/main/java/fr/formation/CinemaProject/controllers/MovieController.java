package fr.formation.CinemaProject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.CinemaProject.entities.Movie;
import fr.formation.CinemaProject.services.MovieService;

@RestController
@RequestMapping("movies")
public class MovieController {
	
	MovieService service;

	public MovieController(MovieService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Movie> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Movie> findById(@PathVariable String id){
		return this.service.findById(id);
	}
	
	@PostMapping
	public Movie save(@RequestBody Movie movie) {
		return this.service.save(movie);
	}
	
	@PutMapping
	public Movie update(@RequestBody Movie movie) {
		return this.service.save(movie);
	}
	
	
	@DeleteMapping
	public void delete(@RequestBody Movie movie) {
		this.service.delete(movie);
	}

}
