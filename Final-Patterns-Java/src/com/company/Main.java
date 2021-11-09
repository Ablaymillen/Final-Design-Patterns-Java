package com.company;

import com.company.GameFactory.Game;
import com.company.GameFactory.GameFactory;
import com.company.GameFactory.Roulette;
import com.company.Person.CommonPlayer;
import com.company.Person.ContextPerson;
import com.company.Person.VipPlayer;
import com.company.UsdToChip.BetAdapter;

public class Main {

    public static void main(String[] args) {
        BetAdapter betAdapter = new BetAdapter(new VipPlayer("Vip", "Vip", "77777"));

        ContextPerson vipPerson = new ContextPerson(new VipPlayer("Vip", "Vip", "77777"));

        GameFactory gameFactory = new GameFactory();
        Game game1 = gameFactory.setGame("roulette");
        vipPerson.executePlayStrategy();
        System.out.println("Bet has been placed " + vipPerson.executePlaceBet(betAdapter.convertToChips(50)) + " chips");
        System.out.println(game1.matchResult());;
        System.out.println(game1.prize(vipPerson.executePlaceBet(betAdapter.convertToChips(50))));

    }
}
