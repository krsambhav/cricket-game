package com.tekion.cricketgame.controller;

import com.tekion.cricketgame.models.Team;
import com.tekion.cricketgame.repository.TeamRepository;
import com.tekion.cricketgame.service.TeamOnboardingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class TeamOnboardingController {
    @Autowired
    private TeamOnboardingService teamOnboardingService;
    @PostMapping("/register")
    public ResponseEntity<Team> registerTeam(@RequestBody Team team){
        return teamOnboardingService.registerTeam(team);
    }
    @GetMapping("/")
    public ResponseEntity<?> getTeams(){
        return teamOnboardingService.getTeams();
    }
}
