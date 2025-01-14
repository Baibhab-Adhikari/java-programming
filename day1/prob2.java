package day1;

class Num {

    int x;

    void get(int x) {
        this.x = x;
    }

    void show() {
        System.out.println("Value of the variable: " + x);
    }

    public static void main(String[] args) {
        Num obj = new Num();
        obj.get(10);
        obj.show();
    }
}