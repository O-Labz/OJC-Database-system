/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author omri
 */
public class CreateTable {
    
    private long duration;
    
    public String CreateTable (String databaseName, String tableName) {
        File table = null;

        //		 create db table
        try {
            long startTime = System.nanoTime();
            table = new File("./data/"+databaseName+"/"+tableName+".txt");
            // if file already exists will do nothing 
            table.createNewFile();
            FileOutputStream outPutFile = new FileOutputStream(table, false); 
            outPutFile.close();
            long endTime = System.nanoTime();
            duration = (endTime - startTime);
                System.out.print("Table " + tableName + " Created");
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } 
        return "Table " + tableName + " was succesfuly created" + " and it took a total of " + duration + "nano seconds to run";
    }
}
