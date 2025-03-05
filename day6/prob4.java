package day6;

class MyException extends Exception {
    String msg;

    MyException(String s) {
        msg = s;
    }

    public String toString() {
        return msg;
    }
}

public class prob4 {

    public static void main(String[] args) {
        int a = 10;
        try {
            if (a > 1) {
                throw new MyException("Exception Occur!");
            } else {
                System.out.println(a);
            }

        } catch (MyException ob) {
            System.out.println("error: " + ob);
        }
    }
}