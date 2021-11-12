package com.company.ObserverCasino;

import com.company.Person.Person;

import java.util.ArrayList;
import java.util.List;

public class CasinoDB {
    private List<Player> players = new ArrayList<>();
    private String gameStatus;

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Person player){
        this.players.remove(player);
    }



    public void NotifyAllUsers(){
        for (Player player: this.players){
            player.update(this.gameStatus);
        }
    }

    public String getGameStatus(){
        return gameStatus;
    }

    public void setGameStatus(String gameStatus){
        this.gameStatus = gameStatus;
        NotifyAllUsers();
    }


}
