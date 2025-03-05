package day6;

// exception class for wrong deposit amount
class WrongAmount extends Exception {
    String e;

    WrongAmount(String e) {
        this.e = e;
    }

    public String toString() {
        return e;
    }
}

// exception class for wrong withdrawal amount
class InsufficientBalance extends Exception {
    String e;

    InsufficientBalance(String e) {
        this.e = e;
    }

    public String toString() {
        return e;
    }
}

// main bank account implementation
class BankAccount {
    String cus_name;
    int cus_acc;
    double balance;

    public void getData(String cus_name, int cus_acc, double balance) {

        this.cus_name = cus_name;
        this.cus_acc = cus_acc;
        this.balance = balance;
    }

    public void showData() {
        System.out.println("Customer Details: ");
        System.out.println("Name: " + cus_name);
        System.out.println("Account No.: " + cus_acc);
        System.out.println("Account Balance: " + balance);
    }

    public void deposit(double amt) {

        try {
            if (amt <= 0) {
                throw new WrongAmount("Deposit amount cannot be negative!");
            } else {
                balance += amt;
                System.out.println("Updated balance: " + balance);
            }
        } catch (WrongAmount e) {
            System.out.println("Error: " + e);
        }
    }

    public void withdraw(double amt) {

        try {
            if (amt > balance) {
                throw new InsufficientBalance("Insufficient Account Balance!");
            } else {
                balance -= amt;
                System.out.println("Updated balance: " + balance);
            }
        } catch (InsufficientBalance e) {
            System.out.println("Error: " + e);
        }
    }

}

public class prob5 {

    public static void main(String[] args) {
        BankAccount ob = new BankAccount();
        ob.getData("Baibhab", 123456789, 10000.00);
        ob.showData();
        System.out.println("------------------------------------------------");
        ob.deposit(-100000);
        System.out.println("------------------------------------------------");
        ob.deposit(10000.00);
        System.out.println("------------------------------------------------");
        ob.showData();
        System.out.println("------------------------------------------------");
        ob.withdraw(1000000);
        System.out.println("------------------------------------------------");
        ob.withdraw(1000);
        ob.showData();
    }
}
