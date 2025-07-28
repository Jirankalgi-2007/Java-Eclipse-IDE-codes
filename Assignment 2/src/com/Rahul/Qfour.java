package com.Rahul;

//WAP to read 5 programming language names at command line and print them in ascending order.
import java.util.*;
public class Qfour {

	public static void main(String[] args) {
		String[] names = new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0 ; i < names.length; i++)
		{
			System.out.println("Enter "+i+" String : ");
			names[i]= sc.next();
		}
		System.out.println("Given String Array : ");
		for(String i : names)
		{
			System.out.println(i);
		}
		System.out.println("\n Sorted Array : ");
		 Arrays.sort(names);
		for(String j : names)
		{
			System.out.println(j);
		}
		
	}

}
