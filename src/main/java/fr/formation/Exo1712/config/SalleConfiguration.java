package fr.formation.Exo1712.config;

import fr.formation.Exo1712.repositories.SalleRepository;
import fr.formation.Exo1712.services.SalleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalleConfiguration {

    @Bean
    public SalleService articleService(SalleRepository repository) {
        return new SalleService(repository);
    }
}
