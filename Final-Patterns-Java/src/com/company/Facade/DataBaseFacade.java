package com.company.Facade;

import com.company.Person.Person;
import com.company.QueryTool;
import com.company.Facade.SingleDatabase.*;


public class DataBaseFacade {
    protected QueryTool csv;
    protected QueryTool sql;

    public DataBaseFacade(){
        csv = DatabaseCSV.getInstance();
        sql = DatabaseSQL.getInstance();
    }

    public void formatCSV(){
        csv.format();
    }

    public void formatSQL(){
        sql.format();
    }

    public String SQLqueryTool(Person person){
       return sql.queryTool(person);
    }

    public String CSVqueryTool(Person person){
        return csv.queryTool(person);
    }

}
