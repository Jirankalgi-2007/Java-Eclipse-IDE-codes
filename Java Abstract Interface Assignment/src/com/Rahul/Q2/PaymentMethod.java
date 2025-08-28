package com.Rahul.Q2;

public abstract class PaymentMethod {
	
	protected double amount;
	
	public PaymentMethod()
	{
		
	}
	public PaymentMethod(double amount)
	{
		this.amount=amount;
	}
	
	public abstract boolean validatePaymentDetails();
	public abstract String processTransaction();
	
}
