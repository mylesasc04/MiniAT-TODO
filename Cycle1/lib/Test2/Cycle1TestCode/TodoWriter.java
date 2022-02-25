package Cycle1.lib.Test2.Cycle1TestCode;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class TodoWriter{
    public static void doWrite() throws IOException{
        
        Scanner input = new Scanner(System.in);
        CSVWriter writer = new CSVWriter(new FileWriter("todo.csv"));
        List <String[]> rows = new ArrayList<>();



        String[] row1 = new String[]{"George Washington", "1st President", "One Dollar"};
        String[] row2 = new String[]{"Abraham Lincoln", "16th President", "Five Dollar"};
        String[] row3 = new String[]{"Andrew Jackson", "7th President", "Twenty Dollar"};




        rows.add(row1);
        rows.add(row2);
        rows.add(row3);

        writer.writeAll(rows);
        writer.close();
        input.close();
    }


    public static void main(String[] args) throws IOException {
        doWrite();
    }
}

