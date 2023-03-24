package com.tekion.cricketgame.repository;

import com.tekion.cricketgame.models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match, String> {

}
