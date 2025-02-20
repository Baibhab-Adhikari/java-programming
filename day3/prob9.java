package day3;

class Student {
    String name;
    int roll;
    String registrationNumber;

    Student(String name, int roll, String registrationNumber) {
        this.name = name;
        this.roll = roll;
        this.registrationNumber = registrationNumber;
    }
}

class UGStudent extends Student {
    String ugCourse;

    UGStudent(String name, int roll, String registrationNumber, String ugCourse) {
        super(name, roll, registrationNumber);
        this.ugCourse = ugCourse;
    }

    void display() {
        System.out.println("UG Student:");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("UG Course: " + ugCourse);
    }
}

class PGStudent extends Student {
    String pgCourse;

    PGStudent(String name, int roll, String registrationNumber, String pgCourse) {
        super(name, roll, registrationNumber);
        this.pgCourse = pgCourse;
    }

    void display() {
        System.out.println("PG Student:");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("PG Course: " + pgCourse);
    }
}

class prob9 {
    public static void main(String[] args) {
        UGStudent ugStudent = new UGStudent("Alice", 101, "UG2021001", "Computer Science");
        PGStudent pgStudent = new PGStudent("Bob", 201, "PG2021001", "Data Science");

        ugStudent.display();
        System.out.println();
        pgStudent.display();
    }
}
