package Cycle1.lib;

import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;


public class Delete { 
    public static void main (String [] args) { 
            
            AnsiConsole.systemInstall(); 
            Scanner x;
            String checkmark = "✓";
            String x_mark = "✗";
            String filePath = "George.csv";
            String removeTask = ""; 
            Scanner input = new Scanner(System.in);
            removeTask = input.next();
            input.close();
        
            String tempFile = "temp.csv";
            File oldFile = new File(filePath);
            File newFile = new File(tempFile);
            String name = ""; String priority = ""; String difficulty = ""; String timeLength = "";
            
        
            try {
                FileWriter fw = new FileWriter(tempFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                x = new Scanner(new File(filePath));
                x.useDelimiter("[,\n]");
            
                while(x.hasNext()) {
                    name = x.next();
                    priority = x.next();
                    difficulty = x.next();
                    timeLength = x.next();
        
                    if(!name.equals(removeTask)){
                        pw.println(name + "," + priority + "," + difficulty + "," + timeLength);
                    }
                }
                x.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File(filePath);
                newFile.renameTo(dump);
                System.out.println(ansi().fg(GREEN).a(checkmark + " Task deleted").reset());
            }
            catch(Exception e) {
                System.out.println(ansi().fg(RED).a(x_mark + " Error! No task with that name").reset());
            }
            AnsiConsole.systemUninstall();
        } 
} 
 