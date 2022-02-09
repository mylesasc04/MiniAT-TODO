package todoProject;

import java.util.*;

public class todoList {
    private ArrayList<todoItem> List = new ArrayList<todoItem>();

    public todoList() {}

    public void addToList(todoItem item) {
        List.add(item);
    }

    public void deleteFromList(int index) {
        List.remove(index);
    }

    public todoItem getFromList(int index) {
        return List.get(index);
    }

    public String toString() {
        String s = "";

        for(int i = 0; i < List.size(); i++) {
            s += "TODO: " + getFromList(i).getTodo() + " Priority: " + getFromList(i).getPriority();
            s += " Difficulty :" + getFromList(i).getDifficulty() + " Time length: " + getFromList(i).getTimeLength();
        }
        return s;
    }

    public int getSize() {
        return List.size();
    }
}
