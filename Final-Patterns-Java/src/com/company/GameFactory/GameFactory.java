package com.company.GameFactory;

public class GameFactory {
    public Game setGame(String gameType){
        if(gameType == null){
            return null;
        }
        if(gameType.equalsIgnoreCase("ROULETTE")){
            return new Roulette();

        } else if(gameType.equalsIgnoreCase("BLACKJACK")) {
            return new BlackJack();
        }

        return null;
    }
}
