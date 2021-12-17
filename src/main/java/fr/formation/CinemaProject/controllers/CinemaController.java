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

import fr.formation.CinemaProject.entities.Cinema;
import fr.formation.CinemaProject.services.CinemaService;

@RestController
@RequestMapping("Cinemas")
public class CinemaController {
	
	CinemaService service;

	public CinemaController(CinemaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Cinema> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cinema> findById(@PathVariable String id) {
		return this.service.findById(id);
	}
	
	@PostMapping
	public Cinema save(@RequestBody Cinema cinema) {
		return this.service.save(cinema);
	}
	
	@PutMapping
	public Cinema update(@RequestBody Cinema cinema) {
		return this.service.save(cinema);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Cinema cinema) {
		this.service.delete(cinema);
	}

}
