package Cycle1.lib;

public class Pepper 
{
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
  public static void main(String args[])
  {
    Thread hook = new Thread(){
      public void run()
      {
        System.out.println("Commands: \n");
        System.out.println("   'help'    View reference page of commands");
        System.out.println("   'add'     Add new task (include priority, difficulty, and time length)");
        System.out.println("             (type task name after command)");
        System.out.println("   'list'    List existing tasks");
        System.out.println("   'edit'    Edit contents of task entry (type task name after command)");
        System.out.println("   'delete'  Remove task from list (type task name after command)");
        System.out.println("   'exit'    Close command-line tool\n");  
        
        System.out.println();
        System.out.println(COLOR_YELLOW + "To view list of commands again, type 'help' " + COLOR_RESET);
        System.out.println(COLOR_YELLOW + "Otherwise select option: " + COLOR_RESET);
      }
    };
 
    Runtime.getRuntime().addShutdownHook(hook);
            System.out.println(COLOR_YELLOW + TEXT_BOLD+ "                        -------------------    Welcome to Pepper   -------------------"+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ " _______                                                         ________                   __ "+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "/       \\                                                       /        |                 /  |"+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "$$$$$$$  | ______    ______    ______    ______    ______       $$$$$$$$/______    ______  $$ |"+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "$$ |__$$ |/      \\  /      \\  /      \\  /      \\  /      \\  ______ $$ | /      \\  /      \\ $$ |"+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "$$    $$//$$$$$$  |/$$$$$$  |/$$$$$$  |/$$$$$$  |/$$$$$$  |/      |$$ |/$$$$$$  |/$$$$$$  |$$ |"+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "$$$$$$$/ $$    $$ |$$ |  $$ |$$ |  $$ |$$    $$ |$$ |  $$/ $$$$$$/ $$ |$$ |  $$ |$$ |  $$ |$$ |"+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "$$ |     $$$$$$$$/ $$ |__$$ |$$ |__$$ |$$$$$$$$/ $$ |              $$ |$$ \\__$$ |$$ \\__$$ |$$ |"+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "$$ |     $$       |$$    $$/ $$    $$/ $$       |$$ |              $$ |$$    $$/ $$    $$/ $$ |"+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "$$/       $$$$$$$/ $$$$$$$/  $$$$$$$/   $$$$$$$/ $$/               $$/  $$$$$$/   $$$$$$/  $$/ "+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "                   $$ |      $$ |                                                              "+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "                   $$ |      $$ |                                                              "+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_BOLD+ "                   $$/       $$/                                                               "+ TEXT_RESET);
        System.out.println(COLOR_YELLOW + TEXT_UNDERLINE + "The Go-To To-Do command line interface for software engineers!\n" + TEXT_RESET);
 
    System.exit(0);
  }
}