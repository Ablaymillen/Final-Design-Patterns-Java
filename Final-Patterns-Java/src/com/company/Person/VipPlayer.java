package com.company.Person;

public class VipPlayer implements Person {

    String firstName;
    String lastName;
    String phoneNum;
    float bet;

    public VipPlayer(String firstName, String lastName, String phoneNum, float bet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.bet = bet;
    }

    @Override
    public void playGame() {
        System.out.println(firstName + " " + lastName +" VIP player plays the game");
    }


    public void setBet(float bet) {
        this.bet = bet;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public float getBet() {
        return bet;
    }

    @Override
    public String toString() {
        return "VipPlayer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", bet=" + bet +
                '}';
    }
}
