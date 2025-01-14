class Student {
    // class variables
    String name, department;
    int roll_no;

    // class constructor
    Student(String n, String dept, int roll) {
        name = n;
        department = dept;
        roll_no = roll;
    }

    // class methods
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Roll: " + roll_no);
    }

    // main method
    public static void main(String[] args) {
        Student s1 = new Student("Baibhab Adhikari", "CSE", 01);
        Student s2 = new Student("Atanu Adhikari", "B.Com", 02);
        s1.show();
        s2.show();
    }

}