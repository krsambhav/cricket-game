package com.tekion.cricketgame.repository;

import com.tekion.cricketgame.models.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {

}
