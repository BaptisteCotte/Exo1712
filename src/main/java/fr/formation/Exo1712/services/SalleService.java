package fr.formation.Exo1712.services;

import fr.formation.Exo1712.models.Salle;
import fr.formation.Exo1712.repositories.SalleRepository;
import java.util.List;
import java.util.Optional;


public class SalleService {
	
	SalleRepository repository;

  
    public SalleService(SalleRepository repository) {
        this.repository = repository;
    }

    //Retourne toutes les salles
    public List<Salle> findAll() {
        return this.repository.findAll();
    }

    //sauvegarde ou update une salle
    public Salle save(Salle object) {
        return this.repository.save(object);
    }
    
    //supression d'une salle
    public void delete(Salle object) {
    	this.repository.delete(object);
    }
    
    //recherche par numero
    public List<Salle> findByNumero(int numero) {
    	return this.repository.findByNumero(numero);
    }
    
    //recherche par id
    public Optional<Salle> findById(String id){
    	return this.repository.findById(id);
    }
    
    //recherche par id de cinema
    public List<Salle> findByCinemaID(String id){
    	return this.repository.findByCinema_id(id);
    }
}
