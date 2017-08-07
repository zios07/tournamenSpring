package com.tournament.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tournament.models.User;
import com.tournament.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/hello")
	public String sayHi() {
		return "Hello you !";
	}
	
	@RequestMapping(value="/user/x")
	public String getUser() {
		return "aea";
	}
	
	@RequestMapping(value = "/user")
	public String getUser(@RequestParam String username) {
		
		User user = userService.getUser(username);
		if(user != null) {
			return user.getRole();
		}
		return "Message d'erreur !!!!!!";
	}
	
	
}	
