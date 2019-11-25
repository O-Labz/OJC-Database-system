/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

/**
 *
 * @author omri
 */
public class DeleteFrom {
    
    public void DeleteFrom(String lineContent) throws IOException
{
    File file = new File("myFile.txt");
    File temp = new File("_temp_");
    PrintWriter out = new PrintWriter(new FileWriter(temp));
    Files.lines(file.toPath())
        .filter(line -> !line.contains(lineContent))
        .forEach(out::println);
    out.flush();
    out.close();
    temp.renameTo(file);
}
    
}
