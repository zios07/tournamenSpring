package com.tournament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tournament.models.Group;

public interface GroupRepository extends JpaRepository<Group, Long>{

}
