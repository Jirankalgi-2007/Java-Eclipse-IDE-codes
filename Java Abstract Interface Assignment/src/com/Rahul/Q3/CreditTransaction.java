package com.Rahul.Q3;

public class CreditTransaction extends Transaction implements Secure, Auditable {

    public CreditTransaction(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    public boolean validateTransaction() {
        return amount > 0;
    }

    @Override
    public String executeTransaction() {
        if (encrypt(transactionId) && verifyUser("USER123")) {
            logTransaction(transactionId);
            return "Transaction " + transactionId + " credited securely.";
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
    public void logTransaction(String transactionId) {
        System.out.println("Transaction " + transactionId + " logged at " + AUDIT_LOG_PATH);
    }
}
