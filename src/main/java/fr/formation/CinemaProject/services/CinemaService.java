package fr.formation.CinemaProject.services;

import java.util.List;
import java.util.Optional;

import fr.formation.CinemaProject.entities.Cinema;
import fr.formation.CinemaProject.repositories.CinemaRepository;

public class CinemaService {
	
	CinemaRepository repository;

	public CinemaService(CinemaRepository repository) {
		this.repository = repository;
	}
	
	public List<Cinema> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Cinema> findById(String id){
		return this.repository.findById(id);
	}
	
	public Cinema save(Cinema cinema) {
		return this.repository.save(cinema);
	}
	
	public void delete(Cinema cinema) {
		this.repository.delete(cinema);
	}
}
