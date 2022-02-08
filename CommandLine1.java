package edu.amoz.todo;
import java.io.*;
import java.util.*;

public class CommandLine1 {

    public class JavaStringHistory {
            private String[] history = new String[4];
    }
    public static void main(String[] args) throws java.io.IOException {
        final String COLOR_BLACK = "\u001b[30m";
        final String COLOR_RED = "\u001b[31m";
        final String COLOR_GREEN = "\u001b[32m";
        final String COLOR_YELLOW = "\u001b[33m";
        final String COLOR_BLUE = "\u001b[34m";
        final String COLOR_MAGENTA = "\u001b[35m";
        final String COLOR_CYAN = "\u001b[36m";
        final String COLOR_WHITE = "\u001b[37m";
        final String COLOR_RESET = "\u001b[0m";

        final String TEXT_BOLD = "\033[1m";
        final String TEXT_UNDERLINE = "\033[4m";
        final String TEXT_RESET = "\033[0m";
        final String CHECK_MARK = "\u2713";
        final String X_MARK = "\u2717";
        final String BULLET_MARK = "\u2022";
        String todo = "";
        String priority = "";
        String difficulty = "";
        String timeLength = "";
        Boolean done = true;
        int i = 0;
        todoList list = new todoList();

        System.out.println(COLOR_YELLOW + TEXT_BOLD + "-------------------    Welcome to Pepper   -------------------" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_UNDERLINE + "The Go-To To-Do command line interface for software engineers!\n" + TEXT_RESET);

        Scanner input = new Scanner(System.in);
        String commandLine;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            //Break with Ctrl+C
            while(true) {
            //read the command
            System.out.print("pepperTodo>");
            commandLine = console.readLine();

            //if just a return, loop
            if(commandLine.equals(""))
            continue;
            //history
            if(commandLine.equals('*')) {
              //new class HistoryStringArray();
             // {
               //   history[4] = history[3]
                //  history[3] = history[2]
                //  history[2] = history[1]
                //  history[1] = history[0]
                //  history[0] = commandLine
            }
            //help command

            if(commandLine.equals("clear")) {

               for( int cls = 0; cls < 10; cls++ ) {
                System.out.println();
               }
            }

            if(commandLine.equals("add")) {
                while(done) {
                    System.out.println("Enter thing todo: ");
                    todo = input.nextLine();
                    System.out.println("Enter priority (low, normal, high): ");
                    priority = input.next();
                    System.out.println("Enter difficulty (easy, normal, hard): ");
                    difficulty = input.next();
                    System.out.println("Enter the expected time length (short, long): ");
                    timeLength = input.next();

                    switch(i) {
                        case 0:
                        todoItem item1 = new todoItem(todo, priority, difficulty, timeLength);
                        list.addToList(item1);
                        break;
        
                        case 1:
                        todoItem item2 = new todoItem(todo, priority, difficulty, timeLength);
                        list.addToList(item2);
                        break;
        
                        case 2:
                        todoItem item3 = new todoItem(todo, priority, difficulty, timeLength);
                        list.addToList(item3);
                        break;
        
                        case 3:
                        todoItem item4 = new todoItem(todo, priority, difficulty, timeLength);
                        list.addToList(item4);
                        break;
        
                        case 4:
                        todoItem item5 = new todoItem(todo, priority, difficulty, timeLength);
                        list.addToList(item5);
                        break;
        
                        default:
                        break;
                    }
        
                    System.out.println("Would you like to add more things todo? (true for yes, false for no): ");
                    done = input.nextBoolean();
                    i++;
                }
            }

            if(commandLine.equals("printList")) {
                list.toString();
            }

            if (commandLine.endsWith(".java")) {
              if(commandLine.startsWith("cat")) {
                System.out.println("test");
                ProcessBuilder pb = new ProcessBuilder();
                //pb = new ProcessBuilder(commandLine);
              }

              else {
                  System.out.println("Incorrect Command");
              }
            }

            if (commandLine.equals("exit")) {

                System.out.println("...Terminating the Virtual Machine");
                System.out.println("...Done");
                System.out.println("Please Close manually with Options > Close");
                System.exit(0);
            }
        }
    }
}