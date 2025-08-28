package com.Rahul.Q3;

public abstract class Transaction {
	double amount;
	String transactionId;
	
	public Transaction(double amount,String transactionId)
	{
		this.amount=amount;
		this.transactionId=transactionId;
		
	}
	public abstract boolean validateTransaction();
	public abstract String executeTransaction();
}
