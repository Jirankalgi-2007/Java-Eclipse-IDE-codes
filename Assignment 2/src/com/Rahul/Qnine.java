package com.Rahul;

import java.util.*;
public class Qnine {
	
	 public static void main(String[] args) {
	        enrollStudent();
	    }

	 public static int validateInput(Object[] details) {
	        String name = (String) details[0];
	        String qualification = (String) details[1];
	        int marks = (int) details[2]; 
	        String university = (String) details[3];

	       
	        for (int i = 0; i < name.length(); i++) {
	            char c = name.charAt(i);
	            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ')) {
	                return 101;
	            }
	        }

	     
	        String[] validQualifications = { "ssc", "hsc", "graduate", "post graduate" };
	        boolean isValidQualification = false;
	        for (String q : validQualifications) {
	            if (qualification.equalsIgnoreCase(q)) {
	                isValidQualification = true;
	                break;
	            }
	        }
	        if (!isValidQualification) {
	            return 102;
	        }

	        
	        if (marks < 1 || marks > 100) {
	            return 103;
	        }

	      
	        for (int i = 0; i < university.length(); i++) {
	            char c = university.charAt(i);
	            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ' || c == '.')) {
	                return 104;
	            }
	        }

	        return -1;
	    }

	    public static void enrollStudent() {
	        Scanner sc = new Scanner(System.in);
	        Object[] studentDetails = new Object[4];

	        System.out.print("Enter student name: ");
	        studentDetails[0] = sc.nextLine();

	        System.out.print("Enter highest qualification (ssc, hsc, graduate, post graduate): ");
	        studentDetails[1] = sc.nextLine();

	        System.out.print("Enter scored marks (1 to 100): ");
	        if (sc.hasNextInt()) {
	            studentDetails[2] = sc.nextInt();
	            sc.nextLine(); // consume newline
	        } else {
	            System.out.println("Invalid input for marks. Please enter an integer.");
	            sc.close();
	            return;
	        }

	        System.out.print("Enter university name: ");
	        studentDetails[3] = sc.nextLine();

	        int result = validateInput(studentDetails);

	        if (result == -1) {
	            System.out.println(" Admission successful! All details are valid.");
	        } else {
	            System.out.println(" Admission failed. Error code: " + result);
	        }

	        sc.close();
	    }

	   

}
