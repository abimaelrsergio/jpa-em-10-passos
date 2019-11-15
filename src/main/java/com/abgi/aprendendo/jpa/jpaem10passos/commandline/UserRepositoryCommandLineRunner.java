package com.abgi.aprendendo.jpa.jpaem10passos.commandline;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abgi.aprendendo.jpa.jpaem10passos.entity.User;
import com.abgi.aprendendo.jpa.jpaem10passos.repository.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Giselle", "Minha patroa");
		userRepository.save(user);

		log.info("Novo usuario criado: " + user);

		Optional<User> userWithIdOne = userRepository.findById(1L);

		log.info("Usuario encontrado: " + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		log.info("Todos usuarios: " + users );
	}

}
