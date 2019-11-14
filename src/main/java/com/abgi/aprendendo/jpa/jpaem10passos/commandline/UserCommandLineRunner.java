package com.abgi.aprendendo.jpa.jpaem10passos.commandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abgi.aprendendo.jpa.jpaem10passos.entity.User;
import com.abgi.aprendendo.jpa.jpaem10passos.entity.repository.UserRepository;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);
	
	@Autowired 
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Giselle", "Minha patroa");
		long id = userRepository.insert(user);
		
		log.info("Novo usuario criado: " + user );
	}

}
