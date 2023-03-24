package com.tekion.cricketgame.repository;

import com.tekion.cricketgame.models.Venue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VenueRepository extends MongoRepository<Venue, String> {

}
