package com.tekion.cricketgame.service;

import com.tekion.cricketgame.models.Player;
import com.tekion.cricketgame.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PlayerOnboardingService {
    @Autowired
    private PlayerRepository playerRepository;

    public ResponseEntity<?> getPlayers(){
        return ResponseEntity.ok(this.playerRepository.findAll());
    }
    public ResponseEntity<?> registerPlayer(@RequestBody Player player){
        return ResponseEntity.ok(this.playerRepository.save(player));
    }
}
