package com.tournament.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tournament.models.Group;

public interface GroupRepository extends CrudRepository<Group, Long>{

}
