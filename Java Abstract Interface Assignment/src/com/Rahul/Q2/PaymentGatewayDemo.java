package com.Rahul.Q2;

public class PaymentGatewayDemo {

	public static void main(String[] args)
	{
		Customer c = new Customer("Shrenik","shrenik@domain.com");
		PaymentMethod p = new CardPayment(4500);
		
		if(p.validatePaymentDetails())
		{
			 String txnId = p.processTransaction();
	            ReceiptGenerator r = new SimpleReciept();

	            c.showUserDetails();
	            System.out.println(r.generateReceipt(txnId, p.amount));
		}else {
			 System.out.println("Payment validation failed.");
		}
	}
}
