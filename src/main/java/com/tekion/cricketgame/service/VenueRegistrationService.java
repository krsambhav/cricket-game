package com.tekion.cricketgame.service;

import com.tekion.cricketgame.models.Venue;
import com.tekion.cricketgame.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class VenueRegistrationService {
    @Autowired
    private VenueRepository venueRepository;
    public ResponseEntity<?> registerVenue(@RequestBody Venue venue){
        return ResponseEntity.ok(this.venueRepository.save(venue));
    }
    public ResponseEntity<?> getVenues(){
        return ResponseEntity.ok(this.venueRepository.findAll());
    }
}
