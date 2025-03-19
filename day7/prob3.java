package day7;

import java.util.Scanner;

class Add extends Thread {
    int a, b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("Addition: " + (a + b));
    }
}

class Sub extends Thread {
    int a, b;

    public Sub(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("Subtraction: " + (a - b));
    }
}

class Div extends Thread {
    int a, b;

    public Div(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Division by zero is not allowed");
    }
}

class Mod extends Thread {
    int a, b;

    public Mod(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        if (b != 0)
            System.out.println("Modulus: " + (a % b));
        else
            System.out.println("Modulus by zero is not allowed");
    }
}

public class prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Add add = new Add(num1, num2);
        Sub sub = new Sub(num1, num2);
        Div div = new Div(num1, num2);
        Mod mod = new Mod(num1, num2);

        System.out.println("Set priority for Add (1 to 10): ");
        add.setPriority(scanner.nextInt());

        System.out.println("Set priority for Sub (1 to 10): ");
        sub.setPriority(scanner.nextInt());

        System.out.println("Set priority for Div (1 to 10): ");
        div.setPriority(scanner.nextInt());

        System.out.println("Set priority for Mod (1 to 10): ");
        mod.setPriority(scanner.nextInt());

        scanner.close();

        add.start();
        sub.start();
        div.start();
        mod.start();
    }
}
