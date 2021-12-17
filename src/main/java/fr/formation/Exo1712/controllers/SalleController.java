package fr.formation.Exo1712.controllers;

import fr.formation.Exo1712.models.Salle;
import fr.formation.Exo1712.services.SalleService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("salles")
public class SalleController {

    
	SalleService service;


    public SalleController(SalleService service) {
        this.service = service;
    }

  
    @GetMapping
    public List<Salle> findAll() {
        return service.findAll();
    }

    
    @GetMapping("id/{id}")
    public Optional<Salle> findById(@PathVariable String id){
        return this.service.findById(id);
    }
    
    
    @GetMapping("numero/{numero}")
    public List<Salle> findByNumero(@PathVariable int numero){
        return this.service.findByNumero(numero);
    }
    
    
    @GetMapping("cinema/{id}")
    public List<Salle> findByCinemaID(@PathVariable String id){
        return this.service.findByCinemaID(id);
    }

    
    @PostMapping
    public Salle save(@RequestBody Salle object) {
        return this.service.save(object);
    }

    
    @PutMapping
    public Salle update(@RequestBody Salle object) {
        return this.service.save(object);
    }

    @DeleteMapping
    public void delete(@RequestBody Salle object) {
        this.service.delete(object);
    }

}
