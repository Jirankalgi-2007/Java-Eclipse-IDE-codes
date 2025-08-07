package com.Rahul.example;

public class Auther {
	public int auther_id;
	public String auther_name;
	
	public void createNewAuther(int auther_id, String auther_name) 
	{
		this.auther_id=auther_id;
		this.auther_name=auther_name;
		
	}
	public String toString(){
		return String.format("Author ID: %d\tAuthor Name: %s", auther_id, auther_name);
	}
	
}
