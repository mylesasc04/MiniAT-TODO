package Cycle1.lib.Test1.Cycle1TestCode;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class TodoWriter{
    public static void doWrite() throws IOException{
        
        Scanner input = new Scanner(System.in);
        CSVWriter writer = new CSVWriter(new FileWriter("todo.csv"));
        List <String[]> rows = new ArrayList<>();
        Integer response;


        System.out.println("how many tasks to add?");
        response = input.nextInt();
        String[] Names = new String[] {};
        for (int i = 1; i < response; i++){
            System.out.println("Please enter task " + i);
            Names[i] = input.nextLine();
        }
        

        rows.add(Names);

        writer.writeAll(rows);
        writer.close();
        input.close();
    }


    public static void main(String[] args) throws IOException {
        doWrite();
    }
}

