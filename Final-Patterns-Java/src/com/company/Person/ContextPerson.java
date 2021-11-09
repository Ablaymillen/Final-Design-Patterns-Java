package com.company.Person;

//context person class strategy assigner
public class ContextPerson {
    private Person person;

    public ContextPerson(Person person){
        this.person = person;
    }

    public void executePlayStrategy(){
        person.playGame();
    }

    public float executePlaceBet(float bet){
        return person.placeBet(bet);
    }

}
