/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author omri
 */
public class CheckCollumn {
    
    public String CheckCollumn(String databaseName, String tableName, String collumnName) throws FileNotFoundException, IOException {
        
        String present = "";
        String location = "";
        BufferedReader Buff = new BufferedReader(new FileReader("./data/"+databaseName+"/"+tableName+".txt"));
        String text = Buff.readLine();
        text = text.replaceAll("int", "").trim();
        text = text.replaceAll("string", "").trim();
        text = text.replaceAll("\\s", "").trim();
        System.out.println(text);
        text = text.replaceAll("(\\|)+", " ").trim();
        String params[] = text.split("\\s");
        for(int i = 0; i < params.length; i++)
        {
            if(collumnName.equals(params[i])){
                present = "true";
                location = (""+i);
                break;
            }else{
                present = "false";
                location = null;
            }
        }
        Buff.close();   
        return present+" "+location;
    }
    
//    public String FetchRow(String databaseName, String tableName, String location, String opperand, String Value)
//    {
//        String result = "";
//        int locate = Integer.parseInt(location);
//        try {
//            File table = new File("./data/"+databaseName+"/"+tableName+".txt");
//            Scanner myReader = new Scanner(table);
//            myReader.nextLine();
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                result = data.replaceAll("(\\s)+", "").trim();;
//                result = result.replaceAll("(\\|)+", " ").trim();
//                String rowParams[] = result.split("\\s");
//                if(opperand.equals("=")){
//                    if(rowParams[locate].equals(Value)){
//                        result = data;
//                    }
//                }
//                System.out.println(Arrays.toString(rowParams));
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        System.out.println("And the final result is: "+result.replaceAll("(\\s)+", " | ").trim());
//        return result;
//    }
    
}
