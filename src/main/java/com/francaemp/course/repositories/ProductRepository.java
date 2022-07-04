package com.francaemp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francaemp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
