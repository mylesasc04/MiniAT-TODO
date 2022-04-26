package Cycle1.lib;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;


public class Edit { 
    public static void main (String [] args) throws IOException, CsvException {
        AnsiConsole.systemInstall(); 
        Scanner x;
        String checkmark = "✓";
        String x_mark = "✗";
        
        File inputFile = new File("George.csv");
        String name = new String();
        String oldItem = new String();
        String newItem = new String();
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        oldItem = scan.next();
        newItem = scan.next();
        scan.close();
        
            CSVReader reader = new CSVReader(new FileReader(inputFile));
            List<String[]> text = reader.readAll();
            
            for(int i=0; i<text.size(); i++){
                String[] modifyTerm = text.get(i);
                for(int j=0; j<modifyTerm.length; j++){
                    if(modifyTerm[j].equals(oldItem)){ 
                        text.get(i)[j] = newItem; 
                        reader.close();

                        CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
                        writer.writeAll(text);
                        writer.flush();
                        writer.close();
                        System.out.println(ansi().fg(YELLOW).a(checkmark + " Task edited").reset());
                    }
                }
            }
        AnsiConsole.systemUninstall();
    }  
}
