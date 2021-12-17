package fr.formation.Exo1712.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.formation.Exo1712.models.Sceance;

public interface SceanceRepository extends MongoRepository<Sceance, String>{

	List<Sceance> findByDate(Date date);
	List<Sceance> findBySalle_id(String id);
	List<Sceance> findByFilm_id(String id);
}