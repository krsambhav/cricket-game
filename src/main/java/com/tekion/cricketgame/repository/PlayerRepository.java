package com.tekion.cricketgame.repository;

import com.tekion.cricketgame.models.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {

}
