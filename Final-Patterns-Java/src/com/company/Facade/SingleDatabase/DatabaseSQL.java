package com.company.Facade.SingleDatabase;
import com.company.Person.Person;
import com.company.QueryTool;


public class DatabaseSQL implements QueryTool {

    private static DatabaseSQL instance = new DatabaseSQL();

    // private constructor so this class cannot be instantiated
    private DatabaseSQL(){}

    public static DatabaseSQL getInstance(){
        return instance;
    }

    public String queryTool(Person person){
        return (person.toString());
    }

    public void format(){
        System.out.println("Data has been formatted in SQL DBMS...");
    }


}
