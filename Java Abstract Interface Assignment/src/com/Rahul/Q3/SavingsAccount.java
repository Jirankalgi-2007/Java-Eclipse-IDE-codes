package com.Rahul.Q3;

public class SavingsAccount extends BankAccount implements Auditable, Taxable, Notifiable {

    public SavingsAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Account: " + accountNumber + " | Holder: " + accountHolder + " | Balance: " + balance);
    }

    @Override
    public void logTransaction(String transactionId) {
        System.out.println("Transaction " + transactionId + " logged at " + AUDIT_LOG_PATH);
    }

    @Override
    public double calculateTax(double amount) {
        return amount * TAX_RATE;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent via " + DEFAULT_CHANNEL + ": " + message);
    }
}
