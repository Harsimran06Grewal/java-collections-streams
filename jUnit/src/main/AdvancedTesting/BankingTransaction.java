package AdvancedTesting;

public class BankingTransaction {
    // Private field to store account balance
    private double balance;

    public static void main(String[] args) {
    }

    // Deposits the given amount into the account.
    public void deposit(double amount) {
        // Amount must be greater than 0.
        if (amount > 0) {
            balance += amount; // Increase balance
        } else {
            System.out.println("Can't add negative balance");
        }
    }


     // Withdraws the given amount from the account.
    public boolean withdraw(double amount) {
        // Withdrawal is allowed only if the amount is positive and within the available balance.
        if (amount > 0 && balance >= amount) {
            balance -= amount; // Deduct from balance
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }


     // Returns the current account balance.
    public double getBalance() {
        return balance;
    }
}
