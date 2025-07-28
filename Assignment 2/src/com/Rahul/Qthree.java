package com.Rahul;
//WAP to input any Number and show that which digit from the input number is max. 
import java.util.*;
public class Qthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Enter Number : ");
		x=sc.next();
		
		char ans ;
		ans=FindMax(x);
		System.out.println(ans +" is max number among input");

	}
	public static char FindMax(String x)
	{
		char max='0';
		for(char c: x.toCharArray())
		{
			if(c > max)
				max=c;
		}
		return max;
	}
}
