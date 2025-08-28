package com.Rahul.Q3;

public class DebitTransaction extends Transaction implements Secure, Taxable, Notifiable {

    public DebitTransaction(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    public boolean validateTransaction() {
        return amount > 0 && amount < 10000;
    }

    @Override
    public String executeTransaction() {
        if (encrypt(transactionId) && verifyUser("USER456")) {
            double tax = calculateTax(amount);
            sendNotification("Transaction " + transactionId + " completed.");
            return "Transaction " + transactionId + " executed securely.\nTax deducted: " + tax;
        }
        return "Transaction failed.";
    }

    @Override
    public boolean encrypt(String data) {
        return data != null && !data.isEmpty();
    }

    @Override
    public boolean verifyUser(String userId) {
        return userId.startsWith("USER");
    }

    @Override
    public double calculateTax(double amount) {
        return amount * TAX_RATE;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent via " + DEFAULT_CHANNEL);
    }
}
