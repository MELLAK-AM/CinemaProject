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

import fr.formation.CinemaProject.entities.Session;
import fr.formation.CinemaProject.services.SessionService;

@RestController
@RequestMapping("Sessions")
public class SessionController {
	
	SessionService service;

	public SessionController(SessionService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Session> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Session> findById(@PathVariable String id){
		return this.service.findById(id);
	}
	
	@PostMapping
	public Session save(@RequestBody Session session) {
		return this.service.save(session);
	}
	
	@PutMapping
	public Session update(@RequestBody Session session) {
		return this.service.save(session);
	}
	
	
	@DeleteMapping
	public void delete(@RequestBody Session session) {
		this.service.delete(session);
	}

}
