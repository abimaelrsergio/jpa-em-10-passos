package com.abgi.aprendendo.jpa.jpaem10passos.commandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abgi.aprendendo.jpa.jpaem10passos.dao.UserDaoService;
import com.abgi.aprendendo.jpa.jpaem10passos.entity.User;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired 
	private UserDaoService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Giselle", "Minha patroa");
		long id = userDaoService.insert(user);
		
		log.info("Novo usuario criado: " + user );
	}

}
