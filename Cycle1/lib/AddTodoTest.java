package Cycle1.lib;

import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class AddTodoTest{
    public static String[] doWrite() throws IOException {

        String filen = "George.csv";
        String name;
        String priority;
        String difficulty;
        String timeLength;
        CSVWriter writer = new CSVWriter(new FileWriter(filen, true));
        Scanner input = new Scanner(System.in);

        System.out.println("What task are you trying to add?");
        name = input.nextLine();
        int nameCommaDetector = name.indexOf(',');

        if (nameCommaDetector != -1) {
            System.out.println("Hey! No commas please!");
            input.close();
            return null;
        }

        System.out.println("What's the Priority?");
        priority = input.nextLine();
        int priorityCommaDetector = priority.indexOf(',');

        if (priorityCommaDetector != -1) {
            System.out.println("Hey! No commas please!");
            input.close();
            return null;
        }

        System.out.println("What's the Difficulty?");
        difficulty = input.nextLine();
        int difficultyCommaDetector = difficulty.indexOf(',');

        if (difficultyCommaDetector != -1) {
            System.out.println("Hey! No commas please!");
            input.close();
            return null;
        }

        System.out.println("How Long is it going to take?");
        timeLength = input.nextLine();
        int timeCommaDetector = timeLength.indexOf(',');

        if (timeCommaDetector != -1) {
            System.out.println("Hey! No commas please!");
            input.close();
            return null;
        }

        System.out.println("Task added!");

        String[] todoItem = new String[] { name, priority, difficulty, timeLength };

        writer.writeNext(todoItem);
        writer.close();
        input.close();
        return todoItem;
    }

    public static void main(String[] args) throws IOException {

        doWrite();

    }
}