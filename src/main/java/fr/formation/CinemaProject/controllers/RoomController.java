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

import fr.formation.CinemaProject.entities.Room;
import fr.formation.CinemaProject.services.RoomService;

@RestController
@RequestMapping("rooms")
public class RoomController {
	RoomService service;
	
	public RoomController(RoomService service) {
		this.service = service;
	}

	@GetMapping
	public List<Room> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Room> findById(@PathVariable String id){
		return this.service.findById(id);
	}
	
	@PostMapping
	public Room save(@RequestBody Room room) {
		return this.service.save(room);
	}
	
	@PutMapping
	public Room update(@RequestBody Room room) {
		return this.service.save(room);
	}
	@DeleteMapping
	 public void delete(@RequestBody Room room) {
	        this.service.delete(room);
	    }

}
