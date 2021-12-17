package fr.formation.Exo1712.controllers;

import fr.formation.Exo1712.models.Cinema;
import fr.formation.Exo1712.services.CinemaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cinemas")
public class CinemaController {

    
	CinemaService service;


    public CinemaController(CinemaService service) {
        this.service = service;
    }

  
    @GetMapping
    public List<Cinema> findAll() {
        return service.findAll();
    }

    
    @GetMapping("id/{id}")
    public Optional<Cinema> findById(@PathVariable String id){
        return this.service.findById(id);
    }
    
    
    @GetMapping("nom/{nom}")
    public List<Cinema> findByNom(@PathVariable String nom){
        return this.service.findByNom(nom);
    }

    
    @PostMapping
    public Cinema save(@RequestBody Cinema object) {
        return this.service.save(object);
    }

    
    @PutMapping
    public Cinema update(@RequestBody Cinema object) {
        return this.service.save(object);
    }

    @DeleteMapping
    public void delete(@RequestBody Cinema object) {
        this.service.delete(object);
    }

}
