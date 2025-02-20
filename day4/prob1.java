package day4;

// Define the Shape interface
interface Shape {
    double area();
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

// Main class to test the implementation
public class prob1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());
    }
}