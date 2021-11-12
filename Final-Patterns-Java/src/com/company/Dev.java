package com.company;

import com.company.GameFactory.GameFactory;
import com.company.ObserverCasino.CasinoDB;
import com.company.Person.CommonPlayer;
import com.company.Person.ContextPerson;
import com.company.Person.Person;
import com.company.Person.VipPlayer;
import com.company.UsdToChip.BetAdapter;

import java.util.Scanner;

public class Dev {
    Scanner sc =new Scanner(System.in);
    CasinoDB db = new CasinoDB();

    public void playerCategory(){

    }

    public Person enterPlayer(){

        System.out.println("Enter first name");
        String name = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println("Enter phone number");
        String phone = sc.next();
        System.out.println("How much would you like to bet");
        int money = sc.nextInt();


        System.out.println("Enter player category");
        String category = sc.next();

        if (category.equalsIgnoreCase("common")){

            return new CommonPlayer(name, lastName, phone, money);
        }
        else if(category.equalsIgnoreCase("vip")) {

            return new VipPlayer(name, lastName, phone, money);
        }

        return null;
    }

    public String gameType(){
        System.out.println("Choose the game");
        String game = sc.next();
        return game;
    }

    public void contextPlayer(){
        Person person = enterPlayer();
        BetAdapter adapter = new BetAdapter(person);
        person.setBet(adapter.convertToChips(person.getBet()));
        GameFactory gameFactory = new GameFactory();
        ContextPerson player = new ContextPerson( person, gameFactory.setGame(gameType()));



        db.addPlayer(player);
        db.setGameStatus("GAME END");
    }

}
