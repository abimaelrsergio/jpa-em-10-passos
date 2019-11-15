package com.abgi.aprendendo.jpa.jpaem10passos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abgi.aprendendo.jpa.jpaem10passos.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
