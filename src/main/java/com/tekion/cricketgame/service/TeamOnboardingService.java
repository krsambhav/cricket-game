package com.tekion.cricketgame.service;

import com.tekion.cricketgame.models.Team;
import com.tekion.cricketgame.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TeamOnboardingService {
    @Autowired
    private TeamRepository teamRepository;
    public ResponseEntity<Team> registerTeam(@RequestBody Team team){
        return ResponseEntity.ok(this.teamRepository.save(team));
    }
    public ResponseEntity<?> getTeams(){
        return ResponseEntity.ok(this.teamRepository.findAll());
    }
}
