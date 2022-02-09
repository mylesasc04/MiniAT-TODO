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
    public static void main(String [] args) throws IOException{

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
                    System.out.println(COLOR_CYAN + "Commands: \n\n" + "   help    View reference page of commands");
                    System.out.println(COLOR_CYAN + "   add     Add new task (include priority, difficulty, and time length)");
                    System.out.println(COLOR_CYAN + "           (type task name after command)");
                    System.out.println(COLOR_CYAN + "   list    List existing tasks");
                    System.out.println(COLOR_CYAN + "   edit    Edit contents of task entry (type task name after command)");
                    System.out.println(COLOR_CYAN + "   delete  Remove task from list (type task name after command)");
                    System.out.println(COLOR_CYAN + "   status  View status of task as either complete (" + CHECK_MARK + ") or in-progress (" + BULLET_MARK +")"); 
                    System.out.println(COLOR_CYAN + "           (type task name after command)\n" + COLOR_RESET);
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
                    listTasks("tasks.txt");
                }
                // 'edit' command //
                if (choice.equals("edit")) {
                    modifyTasks("tasks.txt", "task1", "TASK2");
                }
                
                else {
                    System.out.println(COLOR_YELLOW + "Select Option:" + COLOR_RESET);
                    choice = input.next();
                }
                // 'delete' command //
                if (choice.equals("delete")) {
                    // deleteTasks("tasks.txt");
                }
        }
        System.out.println(list.toString());
    }
    // 'list' method //
    static void listTasks(String filePath) {
        File file = new File("tasks.txt");

        BufferedReader reader = null;
        FileWriter writer = null;
        
        try
        {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            
            while (line != null) 
            {
                line = reader.readLine();
            }
            
            System.out.println(reader);
            
            writer = new FileWriter(file);
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    // 'edit method' //
    static void modifyTasks(String filePath, String oldString, String newString) {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            
            String newContent = oldContent.replaceAll(oldString, newString);
            
            System.out.println(newContent);
            
            writer = new FileWriter(fileToBeModified);
            
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    // 'delete' method //
    /*static void deleteTasks(String filePath, String deletedItem) {
        File fileToBeModified = new File(filePath);
         
        String deletedItem = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            
            while (line != null) 
            {
                deletedItem = deletedItem + line + System.lineSeparator();
                line = reader.readLine();
            }
            
            String newContent = deleted;
            
            System.out.println(newContent);
            
            writer = new FileWriter(fileToBeModified);
            
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    } */
}