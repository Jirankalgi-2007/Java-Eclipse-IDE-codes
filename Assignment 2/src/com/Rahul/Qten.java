package com.Rahul;

//import java.util.*;
public class Qten {

	    public static void main(String[] args) {
        Object[] mixedArray = {
            "Apple", 25, 3.14f,
            "Banana", 42, 9.8f,
            "Cherry", 100, 2.71f,
            "Mango", 7
        };

        System.out.println("String values:");
        for (String s : getStringValues(mixedArray)) {
            System.out.println(s);
        }

        System.out.println("\nInteger values:");
        for (Integer i : getIntegerValues(mixedArray)) {
            System.out.println(i);
        }

        System.out.println("\n Float values:");
        for (Float f : getFloatValues(mixedArray)) {
            System.out.println(f);
        }
    }
	    public static Integer[] getIntegerValues(Object[] input) {
	        Integer[] temp = new Integer[input.length];
	        int count = 0;

	        for (Object obj : input) {
	            if (obj instanceof Integer) {
	                temp[count++] = (Integer) obj;
	            }
	        }

	        Integer[] result = new Integer[count];
	        for (int i = 0; i < count; i++) result[i] = temp[i];
	        return result;
	    }

	  
	    public static Float[] getFloatValues(Object[] input) {
	        Float[] temp = new Float[input.length];
	        int count = 0;

	        for (Object obj : input) {
	            if (obj instanceof Float) {
	                temp[count++] = (Float) obj;
	            }
	        }

	        Float[] result = new Float[count];
	        for (int i = 0; i < count; i++) result[i] = temp[i];
	        return result;
	    }

	  
	    public static String[] getStringValues(Object[] input) {
	        String[] temp = new String[input.length];
	        int count = 0;

	        for (Object obj : input) {
	            if (obj instanceof String) {
	                temp[count++] = (String) obj;
	            }
	        }

	        String[] result = new String[count];
	        for (int i = 0; i < count; i++) result[i] = temp[i];
	        return result;
	    }



}
