package fr.formation.Exo1712.config;

import fr.formation.Exo1712.repositories.CinemaRepository;
import fr.formation.Exo1712.services.CinemaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaConfiguration {

    @Bean
    public CinemaService articleService(CinemaRepository repository) {
        return new CinemaService(repository);
    }
}
