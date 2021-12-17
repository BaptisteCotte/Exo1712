package fr.formation.Exo1712.controllers;

import fr.formation.Exo1712.models.Sceance;
import fr.formation.Exo1712.services.SceanceService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("salles")
public class SceanceController {

    
	SceanceService service;


    public SceanceController(SceanceService service) {
        this.service = service;
    }

  
    @GetMapping
    public List<Sceance> findAll() {
        return service.findAll();
    }

    
    @GetMapping("id/{id}")
    public Optional<Sceance> findById(@PathVariable String id){
        return this.service.findById(id);
    }
    
    
    @GetMapping("date/{date}")
    public List<Sceance> findByNumero(@PathVariable Date date){
        return this.service.findByDate(date);
    }
    
    
    @GetMapping("salle/{id}")
    public List<Sceance> findBySalleID(@PathVariable String id){
        return this.service.findBySalleID(id);
    }
    
    
    @GetMapping("film/{id}")
    public List<Sceance> findByFilmID(@PathVariable String id){
        return this.service.findByFilmID(id);
    }

    
    @PostMapping
    public Sceance save(@RequestBody Sceance object) {
        return this.service.save(object);
    }

    
    @PutMapping
    public Sceance update(@RequestBody Sceance object) {
        return this.service.save(object);
    }

    @DeleteMapping
    public void delete(@RequestBody Sceance object) {
        this.service.delete(object);
    }

}
