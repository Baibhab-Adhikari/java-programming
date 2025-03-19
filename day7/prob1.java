package day7;

class FirstThread extends Thread {
    int variable;

    public FirstThread(int variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("First:" + i);
        }
    }
}

class SecondThread extends Thread {
    int variable;

    // Constructor to initialize the variable
    public SecondThread(int variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Second: " + i);
        }
    }
}

public class prob1 {
    public static void main(String[] args) {
        FirstThread first = new FirstThread(5);
        SecondThread second = new SecondThread(10);

        first.start(); // Start first thread
        second.start(); // Start second thread
    }
}
