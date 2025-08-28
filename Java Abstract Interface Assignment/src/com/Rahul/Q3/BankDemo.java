package com.Rahul.Q3;

public class BankDemo {
	public static void main(String[] args) {
        BankAccount acc = new SavingsAccount("Shrenik", "SB123", 10000);
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.showAccountDetails();

        Transaction txn = new DebitTransaction(500, "TXN001");
        if (txn.validateTransaction()) {
            String result = txn.executeTransaction();
            System.out.println(result);
        }
    }
}
