package com.tournament.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tournament.models.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

}
