package com.Rahul.Q2;

public abstract class User {
	
	public String name;
	public String email;
	
	
	public User(String name , String email)
	{
		this.name=name;
		this.email=email;
		
	}
	
	public abstract void showUserDetails();
	
}
