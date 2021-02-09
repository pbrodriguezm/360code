package com.parodriguez.crud.helpers;

import com.parodriguez.crud.dao.UserDao;
import com.parodriguez.crud.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by raul on 9/02/21.
 */
@Configuration
public class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(UserRepository repository) {
    return args -> {
      log.info("Load data");
      repository.save(new UserDao(1L,
          "Patrick",
          "Rodriguez",
          "123",
          "ADMIN"));
    };
  }

}
