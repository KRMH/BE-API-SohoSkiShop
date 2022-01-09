/**
 * 
 */
package com.sohoskishop.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author george
 *
 */

@Configuration
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(SkiRepository repository) {
		return args -> {
		      log.info("Preloading " + repository.save(new Ski("Rossignol", 1, "Rossignol", "new")));
		      log.info("Preloading " + repository.save(new Ski("Rossignol", 2, "Rossignol", "new")));
		      log.info("Preloading " + repository.save(new Ski("Rossignol", 3, "Rossignol", "new")));
		      log.info("Preloading " + repository.save(new Ski("Rossignol", 2, "Rossignol", "used")));
		      log.info("Preloading " + repository.save(new Ski("Rossignol", 3, "Rossignol", "used")));
		      log.info("Preloading " + repository.save(new Ski("Salomon", 5, "Salomon", "used")));
		      log.info("Preloading " + repository.save(new Ski("Top Ten", 5, "Top Ten", "used")));
		      log.info("Preloading " + repository.save(new Ski("Atomic Red Young", 4, "Atomic", "used")));
		      log.info("Preloading " + repository.save(new Ski("Atomic White Young", 3, "Atomic", "used")));
		    };
	}

}
