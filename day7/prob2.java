package day7;

class AP implements Runnable {
    int a, d;

    public AP(int a, int d) {
        this.a = a;
        this.d = d;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("AP: " + (a + i * d));
        }
    }
}

class GP implements Runnable {
    int a, r;

    public GP(int a, int r) {
        this.a = a;
        this.r = r;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("GP: " + (a * (int) Math.pow(r, i)));
        }
    }
}

public class prob2 {
    public static void main(String[] args) {
        AP ap = new AP(2, 2);
        GP gp = new GP(2, 2);

        Thread apThread = new Thread(ap);
        Thread gpThread = new Thread(gp);

        apThread.start();
        gpThread.start();
    }
}
