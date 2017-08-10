package com.tournament.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tournament.models.Group;
import com.tournament.services.GroupService;

@RestController
@RequestMapping("/groups")
@CrossOrigin
public class GroupController {

	@Autowired
	GroupService groupService;
	
	@RequestMapping(method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Group> getGroups() {
		return groupService.getAllGroups();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Group getGroup(@PathVariable long id) {
		return groupService.getGroup(id);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST , 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Group addGroup(@RequestBody Group group) {
		groupService.addGroup(group);
		return group;
	}
	
}
