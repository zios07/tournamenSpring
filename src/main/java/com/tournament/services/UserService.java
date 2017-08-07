package com.tournament.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tournament.models.User;
import com.tournament.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User getUser(String login) {
		return userRepository.findOne(login);
	}
	
	public void createUser(User user) {
		userRepository.save(user);
	}
	
	
}
