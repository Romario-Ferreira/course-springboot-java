package com.francaemp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francaemp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
