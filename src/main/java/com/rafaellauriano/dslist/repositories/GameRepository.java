package com.rafaellauriano.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaellauriano.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	

}
