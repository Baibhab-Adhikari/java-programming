package day3;

class A {
    int x;

    void setx() {
        x = 10;
    }
}

class B {

    int y;

    void sety() {
        y = 20;
    }
}

class C {

    int total;

    void add(A a, B b) {
        total = a.x + b.y;
    }

    void show() {
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        // create new objects of all the classes
        A a = new A();
        B b = new B();
        C c = new C();

        a.setx();
        b.sety();
        c.add(a, b);
        c.show();
    }
}