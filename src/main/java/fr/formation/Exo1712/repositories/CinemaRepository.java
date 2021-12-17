package fr.formation.Exo1712.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.formation.Exo1712.models.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String>{

	List<Cinema> findByNom(String nom);
}
