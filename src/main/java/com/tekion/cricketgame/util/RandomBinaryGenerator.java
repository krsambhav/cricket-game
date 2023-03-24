package com.tekion.cricketgame.util;

import java.util.Random;

public class RandomBinaryGenerator {
    private Random random;
    public int generateRandomBinary(){
        return random.nextInt(0, 2);
    }
}
