package com.francaemp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francaemp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
