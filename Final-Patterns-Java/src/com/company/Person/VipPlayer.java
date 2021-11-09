package com.company.Person;

public class VipPlayer implements Person {

    String firstName;
    String lastName;
    String phoneNum;

    public VipPlayer(String firstName, String lastName, String phoneNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
    }

    @Override
    public void playGame() {
        System.out.println(firstName + " " + lastName +" VIP player plays the game");
    }

    @Override
    public float placeBet(float bet) {
        return bet*2;
    }
}
