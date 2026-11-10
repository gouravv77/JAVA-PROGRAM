import java.util.*;
class BankAccount {
    protected double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    void deposite(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
       }
       }
class SavingAccount extends BankAccount {
    SavingAccount(double balance) {
        super(balance);
    }
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal not allowed");
            System.out.println("Minimum balance should be 100");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}
public class Ass902 {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(500);
        account.deposite(200);
        account.withdraw(550);
        account.withdraw(100);
    }
}
