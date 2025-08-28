package com.Rahul.Q3;

public abstract class BankAccount {

	String accountHolder,accountNumber;
	double balance;
	
	public BankAccount(String accountHolder,String accountNumber,double balance)
	{
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void showAccountDetails();
	
}
