package day8;

import java.io.*;
import java.util.Vector;

public class ToDoList {
    private Vector<String> tasks;

    public ToDoList() {
        tasks = new Vector<>();
    }

    public void addTask() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a new task: ");
        String task = reader.readLine();
        tasks.add(task);
    }

    public void showTasks() {
        System.out.println("To-Do List: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.print((i + 1) + ". " + tasks.get(i) + " ");
        }
        System.out.println("\n-----------");
    }

    public void insertTask() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the index to insert the task: ");
        int index = Integer.parseInt(reader.readLine());
        System.out.print("Enter the new task: ");
        String task = reader.readLine();
        if (index >= 0 && index <= tasks.size()) {
            tasks.add(index, task);
        } else {
            System.out.println("Invalid index.");
        }
        showTasks();
    }

    public void delTask() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the index of the task to delete: ");
        int index = Integer.parseInt(reader.readLine());
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
        showTasks();
    }

    public static void main(String[] args) throws IOException {
        ToDoList toDoList = new ToDoList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Insert Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    toDoList.addTask();
                    break;
                case 2:
                    toDoList.showTasks();
                    break;
                case 3:
                    toDoList.insertTask();
                    break;
                case 4:
                    toDoList.delTask();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
