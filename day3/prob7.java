package day3;

class Num {
    int x;

    Num(int x) {
        this.x = x;
    }
}

class Deno extends Num {
    int y;

    Deno(int x, int y) {
        super(x);
        this.y = y;
    }
}

class Frac extends Deno {
    Frac(int x, int y) {
        super(x, y);
    }

    void display() {
        System.out.println("Fraction: " + x + "/" + y);
    }
}

class Main {
    public static void main(String[] args) {
        Frac f1 = new Frac(3, 4);
        Frac f2 = new Frac(5, 6);
        f1.display();
        f2.display();
    }
}