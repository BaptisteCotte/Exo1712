package fr.formation.Exo1712.config;

import fr.formation.Exo1712.repositories.SceanceRepository;
import fr.formation.Exo1712.services.SceanceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SceanceConfiguration {

    @Bean
    public SceanceService articleService(SceanceRepository repository) {
        return new SceanceService(repository);
    }
}
