package day3;

class Customer {
    String name;
    int customer_id;

    Customer(String name, int customer_id) {
        this.name = name;
        this.customer_id = customer_id;
    }
}

class SavingAccount extends Customer {
    int account_no;

    SavingAccount(String name, int customer_id, int account_no) {
        super(name, customer_id);
        this.account_no = account_no;
    }
}

class CurrentAccount extends Customer {
    int account_no;
    String status;

    CurrentAccount(String name, int customer_id, int account_no, String status) {
        super(name, customer_id);
        this.account_no = account_no;
        this.status = status;
    }
}

class FixedDeposit extends SavingAccount {
    double amount;
    double interest;
    int period_in_days;

    FixedDeposit(String name, int customer_id, int account_no, double amount, double interest, int period_in_days) {
        super(name, customer_id, account_no);
        this.amount = amount;
        this.interest = interest;
        this.period_in_days = period_in_days;
    }

    void show() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Account No: " + account_no);
        System.out.println("Amount: " + amount);
        System.out.println("Interest: " + interest);
        System.out.println("Period (in days): " + period_in_days);
    }
}

class LoanAccount extends CurrentAccount {
    double amount;
    double interest;

    LoanAccount(String name, int customer_id, int account_no, String status, double amount, double interest) {
        super(name, customer_id, account_no, status);
        this.amount = amount;
        this.interest = interest;
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Account No: " + account_no);
        System.out.println("Status: " + status);
        System.out.println("Loan Amount: " + amount);
        System.out.println("Interest: " + interest);
    }
}

public class prob11 {
    public static void main(String[] args) {
        FixedDeposit fixedDeposit = new FixedDeposit("Alice", 101, 1001, 5000.0, 5.5, 365);
        LoanAccount loanAccount = new LoanAccount("Bob", 102, 1002, "Active", 10000.0, 7.5);

        fixedDeposit.show();
        System.out.println();
        loanAccount.display();
    }
}