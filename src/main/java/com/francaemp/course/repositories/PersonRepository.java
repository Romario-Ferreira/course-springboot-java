package com.francaemp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francaemp.course.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	

}
