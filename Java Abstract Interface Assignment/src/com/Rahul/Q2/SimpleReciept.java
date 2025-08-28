package com.Rahul.Q2;

public class SimpleReciept extends ReceiptGenerator {

	@Override
	public String generateReceipt(String transactionId, double amount) {
		return "Transaction Successful: " + transactionId + "\nAmount: " + amount + " " + SecureTransaction.CURRENCY;
	}
	

}
