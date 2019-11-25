/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author omri
 */
public class CreateTable {
    
    public String CreateTable (String databaseName, String tableName, String sql) {
        File table = null;
        long duration = 0;

        //		 create db table
        try {
            long startTime = System.nanoTime();
            table = new File("./data/"+databaseName+"/"+tableName+".txt");
            // if file already exists will do nothing 
            table.createNewFile();
            FileOutputStream outPutFile = new FileOutputStream(table, false); 
            outPutFile.close();
            System.out.print("Table " + tableName + " Created");
            Matcher parenthesesText = Pattern.compile("\\((.*?)\\)").matcher(sql);
            while(parenthesesText.find()) 
            {
                AddColumns(databaseName, tableName, parenthesesText.group(1));
            }
            long endTime = System.nanoTime();
            duration = (endTime - startTime);
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } 
        return "Table " + tableName + " was succesfuly created" + " and it took a total of " + duration + " nano seconds to run";
    }
    
    
    	public void AddColumns (String databaseName, String tableName, String tableHeader) {
		
		// Update Table
                
                tableHeader = tableHeader.replaceAll("(,)+", "|").trim();
		
		try(FileWriter tableWriter = new FileWriter("./data/"+databaseName+"/"+tableName+".txt", true);
			    BufferedWriter bufferedWriter = new BufferedWriter(tableWriter);
			    PrintWriter output = new PrintWriter(bufferedWriter))
			{
			output.println(tableHeader);

//			Close file after writing
			output.close();
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
		System.out.println("Table columns Succesfully Updated");
	}
}
