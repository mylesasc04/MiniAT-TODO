package edu.amoz.todo;

public class todoItem {
    private String todo = "";
    private String priority = "";
    private String difficulty = "";
    private String timeLength = "";

    public todoItem(String todo, String priority, String difficulty, String timeLength) {
        setTodo(todo);
        setPriority(priority);
        setDifficulty(difficulty);
        setTimeLength(timeLength);
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength;
    }

    public String getTimeLength() {
        return timeLength;
    }
}
