package Cycle1.lib;


import com.opencsv.*;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.*;

public class Print {
    public static void main(String [] args) throws FileNotFoundException, IOException, CsvException {
        PrintList();
    }

    
    public static void PrintList() throws FileNotFoundException, IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("George.csv"));
        List<String[]> list = new ArrayList<>();

        list = reader.readAll();

        String[] todoItem = new String[4];
        todoItem[0] = list.get(0)[0];

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < 4; j++) {

                System.out.print(list.get(i)[j] + "\t");
                if(j >= 1 && i > 0) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

