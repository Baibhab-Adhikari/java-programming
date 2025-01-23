package day3;

class Animal {

    String type;

    void get(String type) {
        this.type = type;
    }
}

class Cat extends Animal {

    String breed, colour;

    void set(String breed, String colour) {
        this.breed = breed;
        this.colour = colour;
    }

    void show() {
        System.out.println("Type: " + type);
        System.out.println("Breed: " + breed);
        System.out.println("Colour: " + colour);
    }
}
class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.get("Domestic");
        cat1.set("Persian", "Grey");
        cat1.show();
        System.out.println("--------------------");
        cat2.get("Wild");
        cat2.set("Calico", "Orange");
        cat2.show();
    }

    
}