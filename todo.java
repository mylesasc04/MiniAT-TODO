import java.util.Scanner;

public class todo {
public static void main(String[] args) {
    System.out.println("\u001b[33m-------------------    Welcome to Pepper   -------------------\u001b[37m");
    System.out.println("\u001b[33mThe Go-To To-Do command line interface for software engineers!\n\u001b[37m");

    final String COLOR_BLACK = "\u001b[30m";
    final String COLOR_RED = "\u001b[31m";
    final String COLOR_GREEN = "\u001b[32m";
    final String COLOR_YELLOW = "\u001b[33m";
    final String COLOR_BLUE = "\u001b[34m";
    final String COLOR_MAGENTA = "\u001b[35m";
    final String COLOR_CYAN = "\u001b[36m";
    final String COLOR_WHITE = "\u001b[37m";
    final String COLOR_RESET = "\u001b[0m";

    Scanner input = new Scanner(System.in);

    final int MAX = 10;

    String[] list = new String[MAX];
    int choice = 0;

    while (choice != 3) {

        System.out.println();
        System.out.println(COLOR_YELLOW + "To view list of commands type 1" + COLOR_RESET);
        System.out.println(COLOR_YELLOW + "Otherwise select option: " + COLOR_RESET);
        choice = input.nextInt();
        int count = 0;

        if (choice == 1) {
            System.out.println(COLOR_YELLOW + "Commands: \n - 1: View list of commands\n" + COLOR_RESET);
            System.out.println(COLOR_YELLOW + " - 2: Add Task\n" + COLOR_RESET);
            System.out.println(COLOR_YELLOW + " - 3: List Existing Tasks");
        }

        if (choice == 2) {
            System.out.println(COLOR_YELLOW + "Add New Tasks, when done type done\n");
            for (int i=0;i<MAX;i++) {
                list[i] = input.nextLine();
                if (list[i].equals(COLOR_GREEN + "done")) break;
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