package fr.formation.Exo1712.controllers;

import fr.formation.Exo1712.models.Film;
import fr.formation.Exo1712.services.FilmService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("films")
public class FilmController {

    
	FilmService service;


    public FilmController(FilmService service) {
        this.service = service;
    }

  
    @GetMapping
    public List<Film> findAll() {
        return service.findAll();
    }

    
    @GetMapping("id/{id}")
    public Optional<Film> findById(@PathVariable String id){
        return this.service.findById(id);
    }
    
    
    @GetMapping("nom/{nom}")
    public List<Film> findByNom(@PathVariable String nom){
        return this.service.findByNom(nom);
    }
    
    
    @GetMapping("duree/{duree}")
    public List<Film> findByDuree(@PathVariable int duree){
        return this.service.findByDuree(duree);
    }

    
    @PostMapping
    public Film save(@RequestBody Film object) {
        return this.service.save(object);
    }

    
    @PutMapping
    public Film update(@RequestBody Film object) {
        return this.service.save(object);
    }

    @DeleteMapping
    public void delete(@RequestBody Film object) {
        this.service.delete(object);
    }

}
