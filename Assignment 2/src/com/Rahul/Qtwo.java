package com.Rahul;
/*WAP to input two numbers and perform command line operations to print addition, subtraction,
 multiplication,division, reminder where the arithmetic symbol is argument. Handle the error 
 in case “arithmetic sign” is wrong */
import java.util.*;

public class Qtwo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,b;
		String ch;
		System.out.println("Enter 1st No: ");
		a=sc.nextInt();
		System.out.println("Enter 2nd No: ");
		b=sc.nextInt();
		System.out.println("Enter Operation Symbol/sign:");
		ch=sc.next();
		switch(ch)
		{
		case "+":System.out.println("Addition : "+(a+b));
		break;
		case "-":System.out.println("Subtraction : "+(a-b));
		break;
		case "*":System.out.println("Multiplication : "+(a*b));
		break;
		case "/":System.out.println("Division : "+(a/b));
		break;
		default:System.out.println("Invalid Input");
		break;
		}
		
		
		
	}
	

}
