package com.jonckdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonckdev.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
