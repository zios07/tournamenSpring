package com.tournament.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tournament.models.User;
import com.tournament.services.UserService;

@RestController
@PropertySource("messages.properties")
public class UserController {
	
	@Autowired
	Environment env;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/user", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getUser(@RequestParam String login) {
		
		User user = userService.getUser(login);
		if(user != null) {
			return user.getRole();
		}
		return env.getProperty("ERROR_404");
	}
	
	
}	
