package com.tournament.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tournament.models.User;

public interface UserRepository extends CrudRepository<User, String>{
	
}
