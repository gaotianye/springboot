package com.gaotianye.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
}
