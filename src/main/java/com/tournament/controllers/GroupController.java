package com.tournament.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tournament.models.Group;
import com.tournament.services.GroupService;

@RestController
@CrossOrigin
public class GroupController {

	@Autowired
	GroupService groupService;
	
	@RequestMapping(value = "/groups", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Group> getPlayer(@RequestParam(required = false) Long id) {
		if(id != null) {
			return Arrays.asList(groupService.getGroup(id));
		} else {
			return groupService.getAllGroups();
		}
		
	}
	
	@RequestMapping(value = "/addGroup", method = RequestMethod.POST , 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Group addGroup(@RequestBody Group group) {
		groupService.addGroup(group);
		return group;
	}
	
}
