package com.company.UsdToChip;

import com.company.Person.Person;

public class BetAdapter implements BetToChip {
    Person person;
    //composition
    public BetAdapter(Person newPerson){
        person = newPerson;
    }

    //converting usd to chips using adapter
    @Override
    public float convertToChips(float bet) {
        return person.getBet() * 50;
    }
}
