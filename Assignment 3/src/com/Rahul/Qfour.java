package com.Rahul;

import com.Rahul.example.Contracts;
import com.Rahul.example.Labor;
import com.Rahul.example.Lorry;

public class Qfour {

	public static void main(String[] args) {
	        Labor[] labors = new Labor[5];
	        labors[0] = new Labor("John", 37, "california", "+1 7878987565");
	        labors[1] = new Labor("Smith", 41, "moscow", "+7 9099828394");
	        labors[2] = new Labor("Peter", 29, "bijing", "+86 9987364664");
	        labors[3] = new Labor("Michael", 28, "Francisco", "+1 9388475773");
	        labors[4] = new Labor(); // default

	        // Lorry array
	        Lorry[] lorries = new Lorry[3];
	        lorries[0] = new Lorry("Panel truck", "83774", 20);
	        lorries[1] = new Lorry("Flatbed truck", "9929", 65);
	        lorries[2] = new Lorry("Dump truck", "10084", 105);

	        // Contracts array
	        Contracts[] contracts = new Contracts[6];
	        contracts[0] = new Contracts(91, "James", labors[1], lorries[0]);
	        contracts[1] = new Contracts(92, "Robert", labors[2], lorries[0]);
	        contracts[2] = new Contracts(93, "Richard", labors[1], lorries[2]);
	        contracts[3] = new Contracts(94, "Paul", labors[3], lorries[1]);
	        contracts[4] = new Contracts(); // default
	        contracts[5] = new Contracts(); // default

	        // Output
	        System.out.println("Labor");
	        for (Labor labor : labors) {
	            System.out.println(labor);
	        }

	        System.out.println("\nLorry");
	        for (Lorry lorry : lorries) {
	            System.out.println(lorry);
	        }

	        System.out.println("\nContracts");
	        for (Contracts contract : contracts) {
	            System.out.println(contract);
	        }

	}

}
