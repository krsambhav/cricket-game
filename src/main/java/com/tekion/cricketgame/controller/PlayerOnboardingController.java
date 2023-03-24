package com.tekion.cricketgame.controller;

import com.tekion.cricketgame.models.Player;
import com.tekion.cricketgame.repository.PlayerRepository;
import com.tekion.cricketgame.service.PlayerOnboardingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerOnboardingController {
    @Autowired
    private PlayerOnboardingService playerOnboardingService;
    @GetMapping("/")
    public ResponseEntity<?> getPlayers(){
        return playerOnboardingService.getPlayers();
    }
    @PostMapping("/register")
    public ResponseEntity<?> registerPlayer(@RequestBody Player player){
        return playerOnboardingService.registerPlayer(player);
    }
}
