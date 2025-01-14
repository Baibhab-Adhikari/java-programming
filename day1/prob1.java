// Write a Java program using the class MyClass that consists of a single method. Print your name, Department roll number using that method.

package day1;

class MyClass {

    public void display() {
        System.out.println("Name: Baibhab Adhikari");
        System.out.println("Department: Computer Science Engineering");
        System.out.println("Roll No: 049");

    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}