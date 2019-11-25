/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author omri
 */
public class TableInsert {
    
    CreateTable createTable = new CreateTable();
    
//    This function inserts a row into a table
    public String TableInsert (String databaseName, String tableName, String row) {
        
        long duration = 0;
        long startTime = System.nanoTime();

        try(FileWriter tableWriter = new FileWriter("./data/"+databaseName+"/"+tableName+".txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(tableWriter);
            PrintWriter output = new PrintWriter(bufferedWriter))
                {
                    Matcher parenthesesText = Pattern.compile("\\((.*?)\\)").matcher(row);
                    while(parenthesesText.find()) 
                    {
                        String result = parenthesesText.group(1).replaceAll("(,)", "|").trim();
                        output.println(result.replaceAll("(')", "").trim());
                    }
                    output.close();
                } catch (IOException e) 
                {
                    //exception handling left as an exercise for the reader
                }
        long endTime = System.nanoTime();
        duration = (endTime - startTime);
        return "All Information insterted into table "+tableName+" succesfully in "+duration+" nano seconds";
    }
    
}
