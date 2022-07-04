package com.francaemp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francaemp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
