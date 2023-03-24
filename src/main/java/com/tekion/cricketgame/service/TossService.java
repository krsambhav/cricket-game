package com.tekion.cricketgame.service;

import com.tekion.cricketgame.util.RandomBinaryGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TossService {
    private RandomBinaryGenerator randomBinaryGenerator;
    public int doToss(){
        return randomBinaryGenerator.generateRandomBinary();
    }
}
