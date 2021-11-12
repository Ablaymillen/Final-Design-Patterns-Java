package com.company;

import com.company.GameFactory.GameFactory;
import com.company.ObserverCasino.CasinoDB;
import com.company.Person.CommonPlayer;
import com.company.Person.ContextPerson;
import com.company.UsdToChip.BetAdapter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        CasinoDB db = new CasinoDB();
//        GameFactory gameFactory = new GameFactory();
//
//        CommonPlayer abl = new CommonPlayer("Ablay", "Aman", "8777151687", 500);
//
//        BetAdapter adapter = new BetAdapter(abl);
//        abl.setBet(adapter.convertToChips(abl.getBet()));
//        ContextPerson ablInCasino = new ContextPerson(abl, gameFactory.setGame("BlackJack"));
//
//
//        db.addPlayer(ablInCasino);
//        db.setGameStatus("Game End!");
        Scanner sc = new Scanner(System.in);
        Dev dev = new Dev();

        System.out.println("How many players there are?");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            dev.contextPlayer();
        }


    }
}
