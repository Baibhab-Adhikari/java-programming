// Write a program to create a class Employee.

package day2;

class Employee {

    String emp_id, emp_name, designation;

    int salary;

    Employee(String id, String name, String desg, int salary) {
        emp_id = id;
        emp_name = name;
        designation = desg;
        this.salary = salary;
    };

    void display() {
        System.out.println("Details of Employee: ");
        System.out.println("-----------------------------------------");
        System.out.println("Name: " + emp_name);
        System.out.println("ID: " + emp_id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    void compare(Employee e) {
        // passing object of the employee class and comparing salary
        if (salary > e.salary) {
            System.out.println("Name: " + emp_name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Name: " + e.emp_name);
            System.out.println("Designation: " + e.designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("ML100", "Baibhab Adhikari", "ML Engineer", 100000);
        Employee e2 = new Employee("DA101", "Pradip Sarkar", "Data Analyst", 90000);

        e1.display();
        System.out.println("-----------------------------------------");

        e2.display();

        System.out.println("-----------------------------------------");

        e1.compare(e2);
    }
}
