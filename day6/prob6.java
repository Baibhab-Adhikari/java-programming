package day6;

import java.io.*;

class WrongMark extends Exception {
    WrongMark(String msg) {
        super(msg);
    }
}

class InvalidGrade extends Exception {
    InvalidGrade(String msg) {
        super(msg);
    }
}

class GradeMismatch extends Exception {
    GradeMismatch(String msg) {
        super(msg);
    }
}

class StudentGrade {
    String stu_name, stu_grade;
    int marks;

    public void getData() throws IOException, WrongMark, InvalidGrade {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Student Name: ");
        stu_name = br.readLine();

        System.out.print("Enter Marks (0-100): ");
        marks = Integer.parseInt(br.readLine());

        if (marks < 0 || marks > 100) {
            throw new WrongMark("Marks should be between 0 and 100.");
        }

        System.out.print("Enter Grade (O, A+, A, B+, B, C, P, F): ");
        stu_grade = br.readLine().trim();

        if (!stu_grade.matches("O|A\\+|A|B\\+|B|C|P|F")) {
            throw new InvalidGrade("Invalid grade entered.");
        }
    }

    public void matchGrade() throws GradeMismatch {
        String correctGrade = "";

        if (marks >= 90 && marks <= 100)
            correctGrade = "O";
        else if (marks >= 80)
            correctGrade = "A+";
        else if (marks >= 70)
            correctGrade = "A";
        else if (marks >= 60)
            correctGrade = "B+";
        else if (marks >= 50)
            correctGrade = "B";
        else if (marks >= 40)
            correctGrade = "C";
        else if (marks >= 30)
            correctGrade = "P";
        else if (marks >= 20)
            correctGrade = "F";

        if (!stu_grade.equals(correctGrade)) {
            throw new GradeMismatch("Grade mismatch! Expected: " + correctGrade + ", but entered: " + stu_grade);
        }
    }

    public void showData() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + stu_name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + stu_grade);
    }
}

public class prob6 {
    public static void main(String[] args) {
        StudentGrade student = new StudentGrade();

        try {
            student.getData();
            student.matchGrade();
            student.showData();
        } catch (IOException e) {
            System.out.println("Error: Invalid Input.");
        } catch (WrongMark | InvalidGrade | GradeMismatch e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
