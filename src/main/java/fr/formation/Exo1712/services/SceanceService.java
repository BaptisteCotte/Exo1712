package fr.formation.Exo1712.services;

import fr.formation.Exo1712.models.Sceance;
import fr.formation.Exo1712.repositories.SceanceRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public class SceanceService {
	
	SceanceRepository repository;

  
    public SceanceService(SceanceRepository repository) {
        this.repository = repository;
    }

    //Retourne toute les Sceances
    public List<Sceance> findAll() {
        return this.repository.findAll();
    }

    //sauvegarde ou update une Sceance
    public Sceance save(Sceance object) {
        return this.repository.save(object);
    }
    
    //supression d'une Sceance
    public void delete(Sceance object) {
    	this.repository.delete(object);
    }
     
    //recherche par id
    public Optional<Sceance> findById(String id){
    	return this.repository.findById(id);
    }
    
    //recherche par date
    public List<Sceance> findByDate(Date date){
    	return this.repository.findByDate(date);
    }
    
    //recherche par id de salle
    public List<Sceance> findBySalleID(String id){
    	return this.repository.findBySalle_id(id);
    }
    
    //recherche par id de film
    public List<Sceance> findByFilmID(String id){
    	return this.repository.findByFilm_id(id);
    }
}
