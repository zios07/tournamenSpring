package com.tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tournament.models.Group;
import com.tournament.repositories.GroupRepository;

@Repository
public class GroupService {
	
	@Autowired
	GroupRepository groupRepository;

	public Group addGroup(Group group) {
		groupRepository.save(group);
		return group;
	}
	
	public void deleteGroup(long id) {
		groupRepository.delete(id);
	}
	
	public Group getGroup(long id) {
		return groupRepository.findOne(id);
	}
	
	public List<Group> getAllGroups(){
		return (List<Group>) groupRepository.findAll();
	}
}
