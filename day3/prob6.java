package day3;

class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }
}

class Dog extends Animal {
    String name, breed;

    Dog(String x, String name, String breed) {
        super(x);
        this.name = name;
        this.breed = breed;
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Dog", "Emily", "Street Dog");
        Dog d2 = new Dog("Dog", "Tiger", "Street Dog");
        d1.display();
        System.out.println("--------------------------");
        d2.display();
    }
}