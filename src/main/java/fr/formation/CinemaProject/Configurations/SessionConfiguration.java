package fr.formation.CinemaProject.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.Document;

import fr.formation.CinemaProject.repositories.SessionRepository;
import fr.formation.CinemaProject.services.SessionService;

@Document
public class SessionConfiguration {
@Bean
public SessionService service(SessionRepository repository) {
	return new SessionService(repository);
}
}
