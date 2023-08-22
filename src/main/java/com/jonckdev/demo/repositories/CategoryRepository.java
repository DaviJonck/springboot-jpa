package com.jonckdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonckdev.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
