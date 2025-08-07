package com.Rahul.example;

public class Publication {
	public int publication_id;
	public String publication_name;
	
	public void createNewPublication(int publication_id, String publication_name) 
	{
		this.publication_id=publication_id;
		this.publication_name=publication_name;
		
	}
	
	public String toString()
	{
		return String.format("Publication ID : %d \t Publication Name : %s ",publication_id,publication_name);
	}

}
