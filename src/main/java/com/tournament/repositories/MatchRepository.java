package com.tournament.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tournament.models.Match;

@Repository
public interface MatchRepository extends CrudRepository<Match, Long>{
	
	@Query("select tm from TMatch tm where date = date_format(sysdate(), '%Y-%m-%d')")
	public List<Match> getTodayMatchs();
	
}
