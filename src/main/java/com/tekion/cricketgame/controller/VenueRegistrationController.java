package com.tekion.cricketgame.controller;

import com.tekion.cricketgame.models.Venue;
import com.tekion.cricketgame.service.VenueRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venues")
public class VenueRegistrationController {
    @Autowired
    private VenueRegistrationService venueRegistrationService;
    @GetMapping("/")
    public ResponseEntity<?> getVenues(){
        return venueRegistrationService.getVenues();
    }
    @PostMapping("/register")
    public ResponseEntity<?> registerVenue(@RequestBody Venue venue){
        return venueRegistrationService.registerVenue(venue);
    }
}
