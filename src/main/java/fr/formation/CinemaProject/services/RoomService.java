package fr.formation.CinemaProject.services;

import java.util.List;
import java.util.Optional;

import fr.formation.CinemaProject.entities.Room;
import fr.formation.CinemaProject.repositories.RoomRepository;


public class RoomService {
	
	private RoomRepository repository;

	public RoomService(RoomRepository repository) {
		this.repository = repository;
	}
	
	public List<Room> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Room> findById(String id){
		return this.repository.findById(id);
	}
	
	public Room save(Room room) {
		return this.repository.save(room);
	}
	
	 public void delete(Room room) {
	        this.repository.delete(room);
	    }

}
