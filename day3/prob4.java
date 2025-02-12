// Multiple classes problem

package day3;

class Add {

    int x, y;

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int add() {
        return x + y;
    }

    void show() {
        System.out.println("Sum: " + add());
    }

}

class Sub {

    int x, y;

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int sub() {
        return x - y;
    }

    void show() {
        System.out.println("Subtraction: " + sub());
    }
}

class Div {

    int x, y;

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int div() {
        if (y == 0) {
            System.out.println("Division by zero is not possible");
            return 0;

        }
        return x / y;
    }

    void show() {
        System.out.println("Division: " + div());
    }
}

class Main {

    public static void main(String[] args) {
        Add add = new Add();
        add.get(12, 6);
        add.show();

        Sub sub = new Sub();
        sub.get(12, 6);
        sub.show();

        Div div = new Div();
        div.get(12, 6);
        div.show();
    }

}