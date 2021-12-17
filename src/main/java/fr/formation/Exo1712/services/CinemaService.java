package fr.formation.Exo1712.services;

import fr.formation.Exo1712.models.Cinema;
import fr.formation.Exo1712.repositories.CinemaRepository;
import java.util.List;
import java.util.Optional;


public class CinemaService {
	
	CinemaRepository repository;

  
    public CinemaService(CinemaRepository repository) {
        this.repository = repository;
    }

    //Retourne tout les cinemas
    public List<Cinema> findAll() {
        return this.repository.findAll();
    }

    //sauvegarde ou update un cinema
    public Cinema save(Cinema object) {
        return this.repository.save(object);
    }
    
    //supression d'un cinema
    public void delete(Cinema object) {
    	this.repository.delete(object);
    }
    
    //recherche par nom
    public List<Cinema> findByNom(String nom) {
    	return this.repository.findByNom(nom);
    }
    
    //recherche par id
    public Optional<Cinema> findById(String id){
    	return this.repository.findById(id);
    }
}
