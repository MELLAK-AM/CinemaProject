package fr.formation.CinemaProject.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.formation.CinemaProject.repositories.MovieRepository;
import fr.formation.CinemaProject.services.MovieService;

@Configuration
public class MovieConfiguration {
	@Bean
	public MovieService service(MovieRepository repository) {
		return new MovieService(repository);
	}

}
