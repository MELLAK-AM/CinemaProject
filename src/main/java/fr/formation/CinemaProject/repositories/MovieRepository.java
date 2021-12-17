package fr.formation.CinemaProject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.CinemaProject.entities.Movie;

public interface MovieRepository extends MongoRepository<Movie, String>{

}
