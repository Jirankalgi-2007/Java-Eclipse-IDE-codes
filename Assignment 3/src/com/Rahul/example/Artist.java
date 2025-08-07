package com.Rahul.example;

import java.util.Scanner;

public class Artist {
	public String uniqueid ;
	public String name;
	Scanner sc ;
	public void createNewArtist()
	{
		sc= new Scanner(System.in);
		System.out.println("Enter Unique ID :");
		uniqueid=sc.next();
		System.out.println("Enter Artist Name :");
		name=sc.next();	
	}
	
	public void  showArtist()
	{
		System.out.println("Artist Unique ID :"+uniqueid);
		System.out.println("Artist Name :"+name);
	}
	
	
}
