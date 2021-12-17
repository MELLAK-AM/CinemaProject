package fr.formation.CinemaProject.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.formation.CinemaProject.repositories.CinemaRepository;
import fr.formation.CinemaProject.services.CinemaService;

@Configuration
public class CinemaConfiguration {
	@Bean
	public CinemaService service(CinemaRepository repository) {
		return new CinemaService(repository);
	}

}
