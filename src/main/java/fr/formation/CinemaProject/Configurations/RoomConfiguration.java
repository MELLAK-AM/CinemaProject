package fr.formation.CinemaProject.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.Document;

import fr.formation.CinemaProject.repositories.RoomRepository;
import fr.formation.CinemaProject.services.RoomService;

@Document
public class RoomConfiguration {
	@Bean
	public RoomService service(RoomRepository repository) {
		return new RoomService(repository);
	}

}
