package com.tekion.cricketgame.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @AllArgsConstructor
@Document(collection = "players")
public class Player {
    @Id
    private String id;
    private String name;
    private enum Type {
        BOWLER,
        BATTER,
    }
    Type type;
    private PlayerStats stats;
}
