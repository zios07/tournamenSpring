package com.tournament.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tournament.models.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long>{
	
	@Query("select tm from TMatch tm where date = date_format(sysdate(), '%Y-%m-%d')")
	public List<Match> getTodayMatchs();
	
}
