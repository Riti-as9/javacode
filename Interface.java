interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Customer {
    String name;
}

class Account {
    int accNo;
    double balance;
}

class Transaction extends Customer implements Bank {
    Account acc = new Account();

    public void deposit(double amount) {
        acc.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (acc.balance >= amount) {
            acc.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + acc.balance);
    }
}

public class Interface {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        t.name = "Vivek";
        t.deposit(1000);
        t.withdraw(500);
        t.display();
    }
}