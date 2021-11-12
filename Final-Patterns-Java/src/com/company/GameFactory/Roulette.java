package com.company.GameFactory;

import java.util.Random;

public class Roulette implements Game {
    Random random = new Random();
    boolean match = random.nextBoolean();

    @Override
    public String matchResult() {
        if (match){
            return "Roulette match result: Victory!!!";
        }
        else return "Roulette match result: You lost";
    }

    @Override
    public float prize(float bet) {
        if (match){
            return bet * (random.nextFloat() + 1);
        }
        else return bet*0;
    }
}
