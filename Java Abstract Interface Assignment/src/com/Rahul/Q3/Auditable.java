package com.Rahul.Q3;

public interface Auditable {
	String AUDIT_LOG_PATH="/audit/logs";
	public void logTransaction(String transactionId);
}
