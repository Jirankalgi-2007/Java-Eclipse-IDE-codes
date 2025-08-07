package com.Rahul.example;

public class Labor {
	
	private String  laborname,  town, contactno ;
	private int age;
	
	public Labor()
	{
		this.laborname="#Unkwon_name ";
		this.age=0;
		this.town="#unkown_town";
		this.contactno="#unkwon_contactno";
		
		
	}
	public Labor(String  laborname, int age,String town,String contactno )
	{
		this.laborname=laborname;
		this.age=age;
		this.town=town;
		this.contactno=contactno;
		
	}
	public String toString()
	{
		return String.format("%10s %10s %10s %10s",this.laborname,this.age,this.town,this.contactno);
	}

	 public String getLaborName() {
	        return this.laborname;
	    }

}
