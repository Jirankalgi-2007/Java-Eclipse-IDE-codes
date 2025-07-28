package com.Rahul;

/*WAP to input an Array of 5 float values. Define a function to take array and one integer value as argument to 
search. Return Position of the search value in array and show the output. In Case the value is not exist in array 
then print the index number and array value which is near to search value */
import java.util.*;
public class Qsix {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        float[] arr = new float[5];

	        System.out.println("Enter 5 float values:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextFloat();
	        }

	        System.out.print("Enter an integer value to search: ");
	        int searchValue = sc.nextInt();

	        int position = search(arr, searchValue);
	        if (position != -1) {
	            System.out.println("Value found at position: " + position);
	        } else {
	            int closestIndex = findClosest(arr, searchValue);
	            System.out.println("Value not found!");
	            System.out.println("Closest value is at index " + closestIndex + " with value " + arr[closestIndex]);
	        }
	    }
		  public static int findClosest(float[] arr, int target) {
		        int closestIndex = 0;
		        float minDiff = Math.abs(arr[0] - target);

		        for (int i = 1; i < arr.length; i++) {
		            float diff = Math.abs(arr[i] - target);
		            if (diff < minDiff) {
		                minDiff = diff;
		                closestIndex = i;
		            }
		        }
		        return closestIndex;
		    }

		    public static int search(float[] arr, int target) {
		        for (int i = 0; i < arr.length; i++) {
		            if ((int) arr[i] == target) {
		                return i;
		            }
		        }
		        return -1;
		    }

}
