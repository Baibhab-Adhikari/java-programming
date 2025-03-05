package day6;

import java.io.*;

class Student {

    String stu_name, stu_program, stu_semester;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the student details: ");
        System.out.print("Name: ");
        stu_name = br.readLine();
        System.out.print("Program: ");
        stu_program = br.readLine();
        System.out.print("Semester: ");
        stu_semester = br.readLine();
    }

    void show() {
        System.out.println("Student Details: ");
        System.out.println("Name: " + stu_name);
        System.out.println("Program: " + stu_program);
        System.out.println("Semester: " + stu_semester);
    }
}

public class prob2 {

    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.getData();
        s2.getData();
        s3.getData();

        System.out.println("-----------------------");
        s1.show();
        System.out.println("-----------------------");
        s2.show();
        System.out.println("-----------------------");
        s3.show();
    }
}
