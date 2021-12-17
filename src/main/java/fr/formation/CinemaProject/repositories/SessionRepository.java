package fr.formation.CinemaProject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.CinemaProject.entities.Session;

public interface SessionRepository extends MongoRepository<Session, String> {

}
