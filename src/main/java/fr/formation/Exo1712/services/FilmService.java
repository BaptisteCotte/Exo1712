package fr.formation.Exo1712.services;

import fr.formation.Exo1712.models.Film;
import fr.formation.Exo1712.repositories.FilmRepository;
import java.util.List;
import java.util.Optional;


public class FilmService {
	
	FilmRepository repository;

  
    public FilmService(FilmRepository repository) {
        this.repository = repository;
    }

    //Retourne tout les films
    public List<Film> findAll() {
        return this.repository.findAll();
    }

    //sauvegarde ou update un film
    public Film save(Film object) {
        return this.repository.save(object);
    }
    
    //supression d'un film
    public void delete(Film object) {
    	this.repository.delete(object);
    }
    
    //recherche par nom
    public List<Film> findByNom(String nom) {
    	return this.repository.findByNom(nom);
    }
    
    //recherche par duree
    public List<Film> findByDuree(int duree){
    	return this.repository.findByDuree(duree);
    }
    
    //recherche par id
    public Optional<Film> findById(String id) {
    	return this.repository.findById(id);
    }
}
