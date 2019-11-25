package src;

import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omri
 */
public class CreateDb {
    
    private File database = null;
    
    public String Createdb (String DatabaseName) {
        
        long startTime = System.nanoTime();
        database = new File("./data/"+DatabaseName);
        database.mkdirs();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        
        return "Database " + DatabaseName + " was succesfuly created" + " and it took a total of " + duration + " nano seconds to run";
    }
    
}
