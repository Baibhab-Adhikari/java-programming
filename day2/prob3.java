// Write a program to create a class Box with data members length, breadth and height. Create two constructors for initializing the data members. Create a method to calculate volume. Create an object of the class and initialize the data members using the constructors. Calculate the volume of the box and display it.

package day2;

class Box {

    int length, breadth, height, volume;

    // Constructor for cuboid

    Box(int l, int b, int h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    // Constructor for cube

    Box(int side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    int calVol() {
        volume = length * breadth * height;
        return volume;
    }

    void display(String shape, int vol) {
        System.out.println("Shape: " + shape + " Volume: " + vol);
    }

    public static void main(String[] args) {
        int vol1, vol2;
        Box cube = new Box(5);
        Box cuboid = new Box(1, 2, 3);

        vol1 = cube.calVol();
        vol2 = cuboid.calVol();

        cube.display("Cube", vol1);
        cuboid.display("Cuboid", vol2);
    }
}