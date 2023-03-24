package com.tekion.cricketgame.controller;

import com.tekion.cricketgame.models.Match;
import com.tekion.cricketgame.service.MatchRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchRegistrationController {
    @Autowired
    private MatchRegistrationService matchRegistrationService;

    @PostMapping("/register")
    public ResponseEntity<?> registerMatch(@RequestBody Match match){
        return matchRegistrationService.registerMatch(match);
    }

    @GetMapping("/")
    public ResponseEntity<?> getMatches(){
        return matchRegistrationService.getMatches();
    }
}
