package com.Rahul;

/*WAP to input n1 and n2 as integer. Print Numbers from n1 to n2. Define Switch Case menus as  
“1. Even Number”,    “2. Prime Number”  ,  “3. Palindrome Numbers”.  
Take a choice from user and solve the requirement  */

import java.util.*;
public class Qfive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Enter No One : ");
		n1=sc.nextInt();
		System.out.println("Enter No Two : ");
		n2=sc.nextInt();
		
		while(true)
		{
			int ch;
			System.out.println("1. Even Number \n2. Prime Number \n3.Palindrome Numbers");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:Even(n1,n2);
			break;
			case 2:Prime(n1,n2);
			break;
			case 3:Palindrome(n1,n2);
			break;
			default:System.out.println("Invalid Input.");
			break;
			}
		}
	

	}
	
	public static void Even(int n1 , int n2)
	{
		for(int i = n1;i<=n2;i++)
		{
			if(i%2 == 0)
				System.out.println(i + " ");
		}
	}
	public static void Prime(int n1 , int n2) {
		
		for(int i = n1 ; i <= n2 ; i++)
		{
			if(isPrime(i))
				System.out.println(i + " ");
		}
	}
	public static void Palindrome(int n1 , int n2)
	{
		for(int i = n1 ; i <= n2 ; i++)
		{
			if(isPalindrome(i))
				System.out.println(i+ " ");
		}
	}
	
	public static boolean isPrime(int n)
	{
		if(n <= 1)
			return false;
		for(int i=2; i<=n/2;i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isPalindrome(int n)
	{
		int original = n,rev = 0;
		while(n > 0)
		{
			rev = rev*10 + n%10;
			n/=10;
		}
		return (rev == original);
	}

}
