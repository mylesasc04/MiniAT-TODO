package Cycle1.lib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Delete extends Pepper {
    String delete;
    Scanner command = new Scanner(System.in);
    delete = command.next();

    if (delete.equals("delete")) {
        final Scanner x;

        String filePath = "tasks.csv";
        String removeTask = "";
        Scanner input = new Scanner(System.in);
        removeTask = input.next();
    
        String tempFile = "temp.csv";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);
        String ID = ""; String dueDate = ""; String description= "";
        
    
        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filePath));
            x.useDelimiter(",");
        
            while(x.hasNext()) {
                description = x.next();
                dueDate = x.next();
                ID = x.next();
    
                if(!ID.equals(removeTask)){
                    pw.println(description + "," + dueDate + "," + ID);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filePath);
            newFile.renameTo(dump);
            System.out.println("Task deleted");
            return;
        }
        catch(Exception e) {
            System.out.println("Error! No task with that ID");
        }
    }
    else {
        System.out.println("Error! No command under that name");
    } 
}
