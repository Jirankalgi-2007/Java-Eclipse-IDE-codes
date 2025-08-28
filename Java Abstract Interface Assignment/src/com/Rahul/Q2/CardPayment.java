package com.Rahul.Q2;

public class CardPayment extends PaymentMethod implements SecureTransaction {

	String cardNumber="1234-5678-9109-2467";
	
	public CardPayment(double amount)
	{
		super(amount);
	}
	@Override
	public boolean encryptData(String data) {
		 return data != null && !data.isEmpty();
	}

	@Override
	public boolean verifyIdentity(String userId) {
		 return userId.startsWith("USER");
	}

	@Override
	public boolean validatePaymentDetails() {
		 return cardNumber.length() == 19 && amount <= MAX_AMOUNT;
	}

	@Override
	public String processTransaction() {
		return "TXN12345";
	}

}
