package com.abgi.aprendendo.jpa.jpaem10passos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.abgi.aprendendo.jpa.jpaem10passos.entity.User;

@Repository
@Transactional
public class UserDaoService {

	@PersistenceContext
	private EntityManager entityManager;

	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
