package fr.formation.CinemaProject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.CinemaProject.entities.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String>{

}
