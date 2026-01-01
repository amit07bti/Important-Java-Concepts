package oops_java;

public class Demo {
}
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

}
 class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}


