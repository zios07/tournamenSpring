package com.tournament.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tournament.models.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>{

}
