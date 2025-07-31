package com.Rahul;
import java.util.Scanner;

class Construction {
    String constructionName;
    float area;
    int estimateTime;
    float estimateCost;

    public Construction(String name, float area, int time, float cost) {
        this.constructionName = name;
        this.area = area;
        this.estimateTime = time;
        this.estimateCost = cost;
    }
}

public class Qeight {

    public static Construction takeConstructionData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter construction name: ");
        String name = sc.nextLine();

        System.out.print("Enter area in sq.ft: ");
        float area = sc.nextFloat();

        System.out.print("Enter estimated time (in days): ");
        int time = sc.nextInt();

        System.out.print("Enter estimated cost (in dollars): ");
        float cost = sc.nextFloat();

        return new Construction(name, area, time, cost);
    }

    public static void submitConstructionData(Construction c) {
        System.out.println("\n--- Construction Details ---");
        System.out.println("Construction Name: " + c.constructionName);
        System.out.println("Area: " + c.area + " sq.ft");
        System.out.println("Estimated Time: " + c.estimateTime + " days");
        System.out.println("Estimated Cost: $" + c.estimateCost);
    }

    public static void main(String[] args) {
        Construction project = takeConstructionData(); 
        submitConstructionData(project);               
    }
}
