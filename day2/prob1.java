// method overloading in Java, calculate area of circle and square using method overloading

package day2;

import java.util.Scanner;

class Area {

    int radius;
    float area, side;

    // area of circle calculation

    float calArea(int r) {
        area = 3.14f * r * r;
        return area;
    }

    // area of square calculation

    float calArea(float side) {
        area = side * side;
        return area;
    }

    void show(String shape, float result) {
        if (shape.equalsIgnoreCase("Circle")) {
            System.out.println("Area of the given circle: " + result);
        } else {
            System.out.println("Area of the given square: " + result);
        }
    }

    public static void main(String[] args) {

        int rad;
        float result1, result2, side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");

        rad = sc.nextInt();

        System.out.println("Enter the side: ");

        side = sc.nextFloat();

        Area ob = new Area(); // instantiation of Area class

        result1 = ob.calArea(rad);
        result2 = ob.calArea(side);

        ob.show("Circle", result1);
        ob.show("Square", result2);

        sc.close();
    }

}