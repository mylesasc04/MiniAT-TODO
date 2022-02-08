import java.util.Scanner;

public class todo {
public static void main(String[] args) {

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

    String[] list = new String[MAX];
    String choice = "";

    System.out.println();
    System.out.println(COLOR_YELLOW + "To view list of commands type 'help' " + COLOR_RESET);
    System.out.println(COLOR_YELLOW + "Otherwise select option: " + COLOR_RESET);
    choice = input.next();
    int count = 0;

    switch (choice) {
        // 'help' command //
        case "help" : 
            System.out.println(COLOR_CYAN + "Commands: \n\n" + "   help    View reference page of commands");
            System.out.println(COLOR_CYAN + "   add     Add new task (include author name, date added, and level of priority)");
            System.out.println(COLOR_CYAN + "           (priority levels: low, normal, or high)");
            System.out.println(COLOR_CYAN + "           (type task name after command)");
            System.out.println(COLOR_CYAN + "   list    List existing tasks");
            System.out.println(COLOR_CYAN + "   edit    Edit contents of task entry (type task name after command)");
            System.out.println(COLOR_CYAN + "   delete  Remove task from list (type task name after command)");
            System.out.println(COLOR_CYAN + "   status  View status of task as either complete (" + CHECK_MARK + ") or in-progress (" + BULLET_MARK +")"); 
            System.out.println(COLOR_CYAN + "           (type task name after command)\n");
        // 'add' command //
        case "add" : 
            System.out.println(COLOR_YELLOW + "Add new task(s), when done type done: ");
            for (int i = 0; i < list.length; i ++) {
                list[i] = input.nextLine();
                if (list[i].equals("done")) break;
                count++;
            }
            System.out.println(COLOR_GREEN + "\nTask(s) added!");
        // 'list' command // 
        case "list" : 
            for (int index = 0;index < list.length; index++) {
                System.out.println(list[index]);                    
            }    
        default :      
            System.out.println(COLOR_YELLOW + "To view list of commands type 'help' " + COLOR_RESET);
            System.out.println(COLOR_YELLOW + "Otherwise select option: " + COLOR_RESET);
            choice = input.next();
    }

}
}