package fr.formation.Exo1712.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.formation.Exo1712.models.Film;

public interface FilmRepository extends MongoRepository<Film, String>{

	List<Film> findByNom(String nom);
	List<Film> findByDuree(int duree);
}
