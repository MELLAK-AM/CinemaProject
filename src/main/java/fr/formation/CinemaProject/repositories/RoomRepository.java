package fr.formation.CinemaProject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.CinemaProject.entities.Room;

public interface RoomRepository extends MongoRepository<Room, String> {

}
