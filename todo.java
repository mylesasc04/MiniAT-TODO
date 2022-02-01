import java.util.Scanner;

public class todo {
public static void main(String[] args) {
    System.out.println("\u001b[33m-------------------    Welcome to Pepper   -------------------\u001b[37m");
    System.out.println("\u001b[33mThe Go-To To-Do command line interface for software engineers!\n\u001b[37m");
/*  
    ANSI Color Codes:
        Black: \u001b[30m
        Red: \u001b[31m
        Green: \u001b[32m
        Yellow: \u001b[33m
        Blue: \u001b[34m
        Magenta: \u001b[35m
        Cyan: \u001b[36m
        White: \u001b[37m
        Reset: \u001b[0m
*/

    Scanner input = new Scanner(System.in);

    final int MAX = 10;

    String[] list = new String[MAX];
    int choice = 0;

    while (choice != 3) {

        System.out.println();
        System.out.println("\u001b[33mTo view list of commands type 1\u001b[37m");
        System.out.println("\u001b[33mOtherwise select option: \u001b[37m");
        choice = input.nextInt();
        int count = 0;

        if (choice == 1) {
            System.out.println("\u001b[33mCommands: \n - 1: View list of commands\n\u001b[37m");
            System.out.println("\u001b[33m - 2: Add Task\n\u001b[37m");
            System.out.println("\u001b[33m - 3: List Existing Tasks");
        }

        if (choice == 2) {
            System.out.println("\u001b[33mAdd New Tasks, when done type done\n");
            for (int i=0;i<MAX;i++) {
                list[i] = input.nextLine();
                if (list[i].equals("done")) break;
                count++;
            }
        }

        if (choice == 3) {
            for (int index = 0;index < list.length; index++) {
                System.out.println(list[index]);                    
            }               
        }

    }

}
}