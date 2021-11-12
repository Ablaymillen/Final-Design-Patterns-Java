package com.company.Person;

import com.company.Facade.DataBaseFacade;
import com.company.GameFactory.Game;
import com.company.ObserverCasino.Player;


//context person class strategy assigner
public class ContextPerson implements Player {
    private Person person;
    private Game game;
    private DataBaseFacade dataBaseFacade = new DataBaseFacade();


    public ContextPerson(Person person, Game game){
        this.person = person;
        this.game = game;
    }


    public void setBet(float bet){
        person.setBet(bet);
    }

    public float executePlaceBet(){
        return person.getBet();
    }


    @Override
    public void update(Object gameStatus) {
        System.out.println(dataBaseFacade.SQLqueryTool(person) + " | " + " | " + game.matchResult() + " | " +   game.prize((person.getBet())));
    }
}
