package com.tekion.cricketgame.service;

import com.tekion.cricketgame.models.Match;
import com.tekion.cricketgame.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MatchRegistrationService {
    private MatchRepository matchRepository;
    public ResponseEntity<?> getMatches() {
        return ResponseEntity.ok(matchRepository.findAll());
    }
    public ResponseEntity<?> registerMatch(@RequestBody Match match){
        return ResponseEntity.ok(matchRepository.save(match));
    }
}
