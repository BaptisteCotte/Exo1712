package fr.formation.Exo1712.config;

import fr.formation.Exo1712.repositories.FilmRepository;
import fr.formation.Exo1712.services.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmConfiguration {

    @Bean
    public FilmService articleService(FilmRepository repository) {
        return new FilmService(repository);
    }
}
