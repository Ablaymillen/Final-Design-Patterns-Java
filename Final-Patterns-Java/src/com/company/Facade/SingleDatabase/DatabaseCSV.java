package com.company.Facade.SingleDatabase;

import com.company.Person.Person;
import com.company.QueryTool;


public class DatabaseCSV implements QueryTool {
    private static DatabaseCSV instance = new DatabaseCSV();


    // private constructor so this class cannot be instantiated
    private DatabaseCSV(){}

    public static DatabaseCSV getInstance(){
        return instance;
    }

    public String queryTool(Person person){
        return (person.toString());
    }

    public void format(){
        System.out.println("Data has been formatted in CSV...");
    }
}
