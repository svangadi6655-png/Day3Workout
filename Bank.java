class BankAccount {
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
   void deposit(double amount) {
        balance = balance + amount;
    }
   void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
    }
 double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(String a, double b) {
        super(a, b);
    }
void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Not enough balance");
        }
    }
}
class CurrentAccount extends BankAccount {
    CurrentAccount(String a, double b) {
        super(a, b);
    }
 void withdraw(double amount) {
        super.withdraw(amount);
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S101", 5000);
        CurrentAccount c = new CurrentAccount("C101", 3000);
        s.deposit(1000);
        s.withdraw(2000);
         c.deposit(500);
        c.withdraw(1000);
       System.out.println("Savings Balance: " + s.getBalance());
        System.out.println("Current Balance: " + c.getBalance());
    }
}