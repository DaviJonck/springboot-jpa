package com.jonckdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonckdev.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
