/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author omri
 */
public class rowDelete {
    
    
    // This function will create a temporary file write everything to it that is needed and omit the row to be deleted.
    public String DeleteFrom(String databaseName, String tableName, String collumnName, String location, String opperand, String Value) throws IOException
{
        String lineToRemove = "";
        long duration = 0;
    
        try {
        long startTime = System.nanoTime();
        File inputFile = new File("./data/"+databaseName+"/"+tableName+".txt");
        File tempFile = new File("./data/"+databaseName+"/temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;
        String result;
        
        int columnLocation = Integer.parseInt(location);

        while((currentLine = reader.readLine()) != null) {
            result = currentLine.replaceAll("(\\s)+", "").trim();
            result = result.replaceAll("(\\|)+", " ").trim();
            String rowParams[] = result.split("\\s");
            if(rowParams[columnLocation].equals(Value))
            {
                lineToRemove = currentLine;
            }
            String trimmedLine = currentLine.trim();
            System.out.println("this is the line to remove : "+lineToRemove);
            if(trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
            



        }
        writer.close(); 
        reader.close(); 
        boolean successful = tempFile.renameTo(inputFile);
        long endTime = System.nanoTime();
        duration = (endTime - startTime);
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    return "Delete line " + lineToRemove + " from table " + tableName + " in " + duration +" nano seconds";
}
    
}
