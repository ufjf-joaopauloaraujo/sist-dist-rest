package com.sist.dist.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new Employee("Felipe Terrana", "Database Admin")));
			log.info("Preloading " + repository.save(new Employee("Guilherme Fiorini Justen", "Software Engineer")));
			log.info("Preloading " + repository.save(new Employee("João Paulo de Carvalho Araújo", "Software Developer")));
		};
	}
}
