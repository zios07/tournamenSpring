package com.tournament.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tournament.models.Match;

@Repository
public interface MatchRepository extends CrudRepository<Match, Long>{

}
