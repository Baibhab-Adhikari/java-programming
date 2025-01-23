package day3;

class Fruit {  // parent class

    String name;

    void getName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Orange extends Fruit {  // child class

    String season;
    float price;

    void getData(String season, float price) {
        this.season = season;
        this.price = price;
    }

    void display() {
        System.out.println("Season: " + season);
        System.out.println("Price: " + price);
    }
}

class Main_ {

    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.getName("Kamla");
        orange.showName();
        orange.getData("Winter", 50.0f);
        orange.display();
    }
}