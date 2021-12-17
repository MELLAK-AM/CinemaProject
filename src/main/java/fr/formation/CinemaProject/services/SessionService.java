package fr.formation.CinemaProject.services;

import java.util.List;
import java.util.Optional;

import fr.formation.CinemaProject.entities.Session;
import fr.formation.CinemaProject.repositories.SessionRepository;

public class SessionService {
	
	private SessionRepository repository;

	public SessionService(SessionRepository repository) {
		this.repository = repository;
	}
	
	public List<Session> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Session> findById(String id){
		return this.repository.findById(id);
	}
	
	public Session save(Session session) {
		return this.repository.save(session);
	}
	
	public void delete(Session session) {
		this.repository.delete(session);
	}

}
