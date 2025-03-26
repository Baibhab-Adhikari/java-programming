package day8;

import java.util.*;

class ToDoList {
    private Vector<String> tasks = new Vector<>();
    private Scanner scanner = new Scanner(System.in);

    void addTask() {
        System.out.print("Enter task: ");
        tasks.add(scanner.nextLine());
    }

    void showTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++)
            System.out.println((i + 1) + ". " + tasks.get(i));
    }

    void insertTask() {
        System.out.print("Enter position: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index < 0 || index > tasks.size())
            return;
        System.out.print("Enter task: ");
        tasks.add(index, scanner.nextLine());
        showTask();
    }

    void delTask() {
        System.out.print("Enter position: ");
        int index = scanner.nextInt() - 1;
        if (index < 0 || index >= tasks.size())
            return;
        tasks.remove(index);
        showTask();
    }
}

public class prob3 {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Task\n2. Show Tasks\n3. Insert Task\n4. Delete Task\n5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> todo.addTask();
                case 2 -> todo.showTask();
                case 3 -> todo.insertTask();
                case 4 -> todo.delTask();
                case 5 -> System.out.println("Goodbye!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
