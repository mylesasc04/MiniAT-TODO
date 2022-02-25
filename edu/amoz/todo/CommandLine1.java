package edu.amoz.todo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import todoProject.todoItem;
import todoProject.todoList;

public class CommandLine1 {

    public static void main(String[] args) throws java.io.IOException {
        final String COLOR_YELLOW = "\u001b[33m";
        final String COLOR_CYAN = "\u001b[36m";
        final String TEXT_BOLD = "\033[1m";
        final String TEXT_UNDERLINE = "\033[4m";
        final String TEXT_RESET = "\033[0m";
        String todo = "";
        String priority = "";
        String difficulty = "";
        String timeLength = "";
        Boolean done = true;
        int i = 0;
        todoList list = new todoList();

        System.out.println(COLOR_YELLOW + TEXT_BOLD + "                        -------------------    Welcome to Pepper   -------------------" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + " _______                                                         ________                   __ " + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "/       \\                                                       /        |                 /  |" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "$$$$$$$  | ______    ______    ______    ______    ______       $$$$$$$$/______    ______  $$ |" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "$$ |__$$ |/      \\  /      \\  /      \\  /      \\  /      \\  ______ $$ | /      \\  /      \\ $$ |" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "$$    $$//$$$$$$  |/$$$$$$  |/$$$$$$  |/$$$$$$  |/$$$$$$  |/      |$$ |/$$$$$$  |/$$$$$$  |$$ |" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "$$$$$$$/ $$    $$ |$$ |  $$ |$$ |  $$ |$$    $$ |$$ |  $$/ $$$$$$/ $$ |$$ |  $$ |$$ |  $$ |$$ |" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "$$ |     $$$$$$$$/ $$ |__$$ |$$ |__$$ |$$$$$$$$/ $$ |              $$ |$$ \\__$$ |$$ \\__$$ |$$ |" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "$$ |     $$       |$$    $$/ $$    $$/ $$       |$$ |              $$ |$$    $$/ $$    $$/ $$ |" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "$$/       $$$$$$$/ $$$$$$$/  $$$$$$$/   $$$$$$$/ $$/               $$/  $$$$$$/   $$$$$$/  $$/ "+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "                   $$ |      $$ |                                                              " + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "                   $$ |      $$ |                                                              " + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD + "                   $$/       $$/                                                               " + TEXT_RESET);

        System.out.println(COLOR_YELLOW + "                        " + TEXT_UNDERLINE + "The Go-To To-Do command line interface for software engineers!\n" + TEXT_RESET);

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
            if(commandLine.equals("help")) {
                System.out.println(COLOR_CYAN + TEXT_BOLD + "COMMANDS: \n help: displays this help page. \n add: adds a new todo list item. \n exit: exits the program. \n clear: clears the current screen.\n" + TEXT_RESET);
            }
            if(commandLine.equals("clear")) {

               for( int cls = 0; cls < 10; cls++ ) {
                System.out.println();
               }
            }


            if(commandLine.equals("add")) {
                while(done) {
                    System.out.println("Enter thing todo: ");
                    todo = input.next();
                        do{
                            System.out.println("Enter priority (low, normal, high): ");
                            priority = input.next();
                }while(priority.equals("low") != true && priority.equals("normal") != true && priority.equals("high") != true);
                do {
                            System.out.println("Enter difficulty (easy, medium, difficult): ");
                            difficulty = input.next();
               }while(difficulty.equals("easy") != true && difficulty.equals("medium") != true && difficulty.equals("difficult") != true);
                do{
                            System.out.println("Enter the expected time length (short, long): ");
                            timeLength = input.next();
                            }while(timeLength.equals("short") != true && timeLength.equals("long") != true);

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