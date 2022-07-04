package com.francaemp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francaemp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
