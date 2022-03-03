package edu.todoManager1;

import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class Add {
    public static void main(String [] args) throws IOException {
        add();
    }

    public static void add() throws IOException {
        Scanner input = new Scanner(System.in);
        CSVWriter writer = new CSVWriter(new FileWriter("todo.csv"));
        ArrayList<String[]> list = new ArrayList<>();
        int i = 0;
        boolean done = false;

        while(!done) {
            switch(i) {
                case 0:
                String [] todoItem1 = new String[4];
                System.out.println("Enter something todo: ");
                todoItem1[0] = input.nextLine();

                System.out.println("Enter the priority: ");
                todoItem1[1] = input.next();

                System.out.println("Enter the difficulty: ");
                todoItem1[2] = input.next();

                System.out.println("Enter the expected time length: ");
                todoItem1[3] = input.next();
                list.add(todoItem1);
                break;

                case 1:
                String [] todoItem2 = new String[4];
                System.out.println("Enter something todo: ");
                todoItem2[0] = input.nextLine();

                System.out.println("Enter the priority: ");
                todoItem2[1] = input.next();

                System.out.println("Enter the difficulty: ");
                todoItem2[2] = input.next();

                System.out.println("Enter the expected time length: ");
                todoItem2[3] = input.next();

                list.add(todoItem2);
                break;

                case 2:
                String [] todoItem3 = new String[4];
                System.out.println("Enter something todo: ");
                todoItem3[0] = input.nextLine();

                System.out.println("Enter the priority: ");
                todoItem3[1] = input.next();

                System.out.println("Enter the difficulty: ");
                todoItem3[2] = input.next();

                System.out.println("Enter the expected time length: ");
                todoItem3[3] = input.next();

                list.add(todoItem3);
                return;

                case 3:
                String [] todoItem4 = new String[4];
                System.out.println("Enter something todo: ");
                todoItem4[0] = input.nextLine();

                System.out.println("Enter the priority: ");
                todoItem4[1] = input.next();

                System.out.println("Enter the difficulty: ");
                todoItem4[2] = input.next();

                System.out.println("Enter the expected time length: ");
                todoItem4[3] = input.next();

                list.add(todoItem4);
                break;

                default:
                break;
            }
            System.out.println("Would you like to add another thing todo? (Y/N)");

            if(input.next().equals("N")) {
                done = true;
                writer.writeAll(list);
                writer.close();
            }
            input.nextLine();
            i++;
        }
    }
}
