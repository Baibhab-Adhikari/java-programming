package day6;

import java.util.Scanner;

class Division {
    int dividend;
    int divisor;


    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        divisor = scanner.nextInt();
        scanner.close();
    }

    public void doDivision() {
        try {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Exiting the program...");
        }
    }

}

public class prob1 {

    public static void main(String[] args) {
        Division division = new Division();
        division.getInput();
        division.doDivision();
    }
}