package com.Rahul.Q2;

public interface SecureTransaction {
	
	int MAX_AMOUNT = 100000;
	String CURRENCY = "INR";
	
	public boolean encryptData(String data); 
	public boolean verifyIdentity(String userId) ;
}
