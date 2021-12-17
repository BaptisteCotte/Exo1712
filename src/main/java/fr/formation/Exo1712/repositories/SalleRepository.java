package fr.formation.Exo1712.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.formation.Exo1712.models.Salle;

public interface SalleRepository extends MongoRepository<Salle, String>{

	List<Salle> findByNumero(int numero);
	List<Salle> findByCinema_id(String id);
}