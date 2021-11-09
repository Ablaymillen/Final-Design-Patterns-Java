package com.company.Person;

public class CommonPlayer implements Person {
    String firstName;
    String lastName;
    String phoneNum;

    public CommonPlayer(String firstName, String lastName, String phoneNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
    }


    @Override
    public void playGame() {
        System.out.println(firstName + " " + lastName + " common player plays the Game");
    }

    @Override
    public float placeBet(float bet) {
        return bet;
    }


}
