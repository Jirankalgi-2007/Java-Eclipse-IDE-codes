package com.Rahul;

/* WAP to input array contains 5 String values. Define a function which has String array argument. Return a new 
array which has  “Strings which not contains any symbol and number”. */
import java.util.*;
public class Qseven {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] strings = new String[5];

	        System.out.println("Enter 5 strings:");
	        for (int i = 0; i < strings.length; i++) {
	            strings[i] = sc.nextLine();
	        }

	        String[] result = filterAlphaOnly(strings);

	        System.out.println("\nStrings without symbols or numbers:");
	        for (int i = 0; i < result.length; i++) {
	            System.out.println(result[i]);
	        }
	        sc.close();
	    }
	  
	  public static String[] filterAlphaOnly(String[] input) {
	        String[] temp = new String[input.length];
	        int count = 0;

	        for (int i = 0; i < input.length; i++) {
	            if (input[i].matches("[a-zA-Z]+")) {
	                temp[count] = input[i];
	                count++;
	            }
	        }

	        // Final result array with exact size
	        String[] result = new String[count];
	        for (int i = 0; i < count; i++) {
	            result[i] = temp[i];
	        }

	        return result;
	    }



}
