package day1;

class Arithmetic {

    int x, y;

    void add() {
        System.out.println("Addition: " + (x + y));
    }

    void sub() {

        System.out.println("Subtraction: " + (x - y));
    }

    void multiply() {
        System.out.println("Multiplication: " + (x * y));

    }

    void division() {
        if (y == 0) {
            System.out.println("Cannot divide by Zero!");
        } else {
            System.out.println("Division: " + (x / y));
        }
    }

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();

        obj.get(2, 4);
        obj.add();
        obj.sub();
        obj.multiply();
        obj.division();
    }

}