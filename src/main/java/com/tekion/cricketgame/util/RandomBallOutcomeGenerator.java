package com.tekion.cricketgame.util;

import java.util.Random;

public class RandomBallOutcomeGenerator {
    private Random random;
    public int getRandomOutcome(){
        return random.nextInt(0, 8);
    }
}
