package todoProject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class printTodo {
        public static String COLOR_BLACK = "\u001b[30m";
        public static String COLOR_RED = "\u001b[31m";
        public static String COLOR_GREEN = "\u001b[32m";
        public static String COLOR_YELLOW = "\u001b[33m";
        public static String COLOR_BLUE = "\u001b[34m";
        public static String COLOR_MAGENTA = "\u001b[35m";
        public static String COLOR_CYAN = "\u001b[36m";
        public static String COLOR_WHITE = "\u001b[37m";
        public static String COLOR_RESET = "\u001b[0m";

        public static String TEXT_BOLD = "\033[1m";
        public static String TEXT_UNDERLINE = "\033[4m";
        public static String TEXT_RESET = "\033[0m";
        public static String CHECK_MARK = "\u2713";
        public static String X_MARK = "\u2717";
        public static String BULLET_MARK = "\u2022";
    public static void main(String [] args) throws IOException{


        System.out.println(COLOR_YELLOW + TEXT_BOLD + "-------------------    Welcome to Pepper   -------------------" + TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_UNDERLINE + "The Go-To To-Do command line interface for software engineers!\n" + TEXT_RESET);

        Scanner input = new Scanner(System.in);

        final int MAX = 10;
        String[] task = new String[MAX];
        String choice = "";

        System.out.println();
        System.out.println(COLOR_YELLOW + "To view list of commands type 'help' " + COLOR_RESET);
        System.out.println(COLOR_YELLOW + "Otherwise select option: " + COLOR_RESET);
        choice = input.next();
        int count = 0;

        String todo = "";
        String priority = "";
        String difficulty = "";
        String timeLength = "";
        Boolean done = true;  
        int i = 0;
        todoList list = new todoList();

        while(done) {
                // 'help' command //
                if(choice.equals("help")) {  
                    System.out.println(COLOR_CYAN + "Commands: \n");
                    System.out.println(COLOR_CYAN + "   'help'    View reference page of commands");
                    System.out.println(COLOR_CYAN + "   'add'     Add new task (include priority, difficulty, and time length)");
                    System.out.println(COLOR_CYAN + "             (type task name after command)");
                    System.out.println(COLOR_CYAN + "   'list'    List existing tasks");
                    System.out.println(COLOR_CYAN + "   'edit'    Edit contents of task entry (type task name after command)");
                    System.out.println(COLOR_CYAN + "   'delete'  Remove task from list (type task name after command)\n");
                    /*
                    System.out.println(COLOR_CYAN + "   status  View status of task as either complete (" + CHECK_MARK + ") or in-progress (" + BULLET_MARK +")"); 
                    System.out.println(COLOR_CYAN + "           (type task name after command)\n" + COLOR_RESET); 
                    */
                }
                // 'add' command //
                if (choice.equals("add")) {
                    try {                  
                        FileWriter writer = new FileWriter("tasks.txt");

                        System.out.println(COLOR_YELLOW + "Enter todo task name:" + TEXT_RESET);
                        todo = input.next();
                        writer.write(todo + "\n");
                        
                        System.out.println(COLOR_YELLOW + "Enter priority of task (low, normal, high):" + TEXT_RESET);
                        priority = input.next();               
                        writer.write(priority + "\n");
                        
                        System.out.println(COLOR_YELLOW + "Enter difficulty (easy, normal, hard):" + TEXT_RESET);
                        difficulty = input.next();
                        writer.write(difficulty + "\n");
                        
                        System.out.println(COLOR_YELLOW + "Enter the expected time length (short, long):" + TEXT_RESET);
                        timeLength = input.next();
                        writer.write(timeLength + "\n");
                        
                        writer.close();

                        System.out.println(COLOR_GREEN + "\nTask(s) added!");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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
                }
                // 'list' command //
                if (choice.equals("list")) {
                    listTasks();
                }
                // 'edit' command //
                if (choice.equals("edit")) {
                    modifyTasks();
                }
                // 'delete' command //
                if (choice.equals("delete")) {
                    deleteTasks();
                }
                else {
                    System.out.println(COLOR_YELLOW + "Select Option:" + COLOR_RESET);
                    choice = input.next();
                }
        }
        System.out.println(list.toString());
    }
    // 'list' method //
    static void listTasks() {

        File file = new File("tasks.txt");

        int counter = 0;
        BufferedReader reader = null;

        String line = null;
        int rand;
        
        try
        { reader = new BufferedReader(new FileReader(file));

            String data = null;
            List<String> taskInfo = new ArrayList<String>();

            while ((data = reader.readLine()) != null)
            {
                taskInfo.add(data);
            }
            reader.close();

            rand = (int) Math.random() * (taskInfo.size()) + 1;
            line = taskInfo.get(rand - 1);

            for (int i = 0; i < taskInfo.size(); i++)
            {
                System.out.println(COLOR_CYAN + " " + taskInfo.get(i));
            }
        } catch (Exception e)
        {
            System.out.println("File cannot be found!!");
        }
           
    }
    // 'edit method' //
    static void modifyTasks() throws IOException {
        
        String filePath = "tasks.txt";
        Scanner sc = new Scanner(new File(filePath));
        Scanner editor = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();

        while (sc.hasNextLine()) {
        buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        sc.close();

        System.out.println(COLOR_YELLOW + "Item to edit: " + COLOR_RESET);
        String oldLine = editor.nextLine();
        System.out.println(COLOR_YELLOW + "Edit item to: " + COLOR_RESET);
        String newLine = editor.nextLine();

        fileContents = fileContents.replaceAll(oldLine, newLine);
        FileWriter writer = new FileWriter(filePath);
        System.out.println("\n" + COLOR_CYAN + oldLine + COLOR_RESET + " edited to " + COLOR_CYAN + newLine + COLOR_RESET + "\n");
        System.out.println("Task now reads as:");

        writer.append(fileContents);
        writer.flush();

        int counter = 0;
        BufferedReader reader = null;

        File file = new File("tasks.txt");

        String line = null;
        int rand;

        try
        { reader = new BufferedReader(new FileReader(file));

            String data = null;
            List<String> taskInfo = new ArrayList<String>();

            while ((data = reader.readLine()) != null)
            {
                taskInfo.add(data);
            }
            reader.close();

            rand = (int) Math.random() * (taskInfo.size()) + 1;
            line = taskInfo.get(rand - 1);
         
            for (int i = 0; i < taskInfo.size(); i++)
            {
                System.out.println(COLOR_CYAN  + " " + taskInfo.get(i));
            }
        } catch (Exception e)
        {
            System.out.println("File cannot be found!!");
        }
    }

    // 'delete' method //
    static void deleteTasks() throws IOException {
        
        String filePath = "tasks.txt";
        Scanner sc = new Scanner(new File(filePath));
        Scanner editor = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();

        while (sc.hasNextLine()) {
        buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        sc.close();

        System.out.println(COLOR_YELLOW + "Item to delete: " + COLOR_RESET);
        String oldLine = editor.nextLine();
        String newLine = "";

        fileContents = fileContents.replaceAll(oldLine, newLine);
        FileWriter writer = new FileWriter(filePath);
        System.out.println("\n" + COLOR_CYAN + oldLine + COLOR_RESET + " deleted" + "\n");

        writer.append(fileContents);
        writer.flush();

        int counter = 0;
        BufferedReader reader = null;

        File file = new File("tasks.txt");

        String line = null;
        int rand;

    } 
}