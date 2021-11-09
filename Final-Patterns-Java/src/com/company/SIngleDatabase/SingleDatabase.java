package com.company.SIngleDatabase;

public class SingleDatabase {
    private static SingleDatabase instance = new SingleDatabase();

    // private constructor so this class cannot be instantiated
    private SingleDatabase(){}
    public static SingleDatabase getInstance(){
        return instance;
    }


    public void StoreToDb(){

    }
}
