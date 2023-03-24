package com.tekion.cricketgame.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "teams") @Data @AllArgsConstructor
public class Team {
    @Id
    private String id;
    private String name;
    ArrayList<Player> allPlayers;
    ArrayList<Player> playingPlayers;
}
