package com.tekion.cricketgame.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @AllArgsConstructor
@Document(collection = "matches")
public class Match {
    @Id
    private String id;
    private String teamAName;
    private String teamBName;
    private MatchTeamStats teamAStats;
    private MatchTeamStats teamBStats;
    private String winner;
    private Venue venue;
}
