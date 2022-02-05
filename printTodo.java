package edu.amoz.todo;
import java.util.*;

public class printTodo {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String todo = "";
        String priority = "";
        String difficulty = "";
        String timeLength = "";
        Boolean done = true;
        int i = 0;
        todoList list = new todoList();

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

        System.out.println(list.toString());
    }
}
