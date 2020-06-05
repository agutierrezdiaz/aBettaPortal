package org.a.betta.portal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@SpringBootApplication
public class ABettaService implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(ABettaService.class);
	
	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ABettaService.class, args);
	}
	
	public void run(String... args) throws Exception {
		logger.debug("aBetta service module is running");
	}

}
