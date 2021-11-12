package com.company.GameFactory;

import java.util.Random;

public class BlackJack implements Game {
    Random random = new Random();
    int player = random.nextInt(21);
    int dealer = random.nextInt(21);

    @Override
    public String matchResult() {
        if (player > dealer){
            return "Black Jack match result: Victory!!!";
        }
        else return "Black Jack match result: You lost";
    }

    @Override
    public float prize(float bet) {
        if (player > dealer){
            return bet * (random.nextFloat() + 1);
        }
        else return bet * 0;
    }



}
