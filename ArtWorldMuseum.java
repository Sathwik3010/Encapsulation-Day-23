package com.codegnan.encapsulation;

import java.util.Scanner;

public class ArtWorldMuseum {

	private int museumID;
	private int[] dailyVisitors;
	
	
	public ArtWorldMuseum(int museumID, int[] dailyVisitors) {
		super();
		this.museumID = museumID;
		this.dailyVisitors = dailyVisitors;
	}

	
	public int getMuseumID() {
		return museumID;
	}


	public void setMuseumID(int museumID) {
		this.museumID = museumID;
	}


	public int getTotalVisitors() {
		int total = 0;
		for(int v: dailyVisitors) {
			total+= v;
		}
		if(total > 100000)
			total = 100000;
		return total;
	}


	public void setDailyVisitors(int[] dailyVisitors) {
		this.dailyVisitors = dailyVisitors;
	}

	public int totalVisitors(int[] arr) {
		int sum=0;
		for(int v: arr)
			sum+=v;
		if(sum> 100000)
			sum=100000;
		return sum;
	}

	public int adjustedVisitors(int visitors) {
		double adjusted = Math.floor(visitors*1.1);
		if(adjusted > 100000)
			adjusted = 100000;
		return (int) adjusted;
	}
	
	public int totalPlusEvent(int[] arr) {
		int sum=0;
		for(int v: arr)
			sum+=v;
		sum+=500;
		if(sum>100000)
			sum=100000;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        
        int n = sc.nextInt();
        int[] visitors = new int[n];
        for(int i=0;i<n;i++)
        	visitors[i]=sc.nextInt();
        
        ArtWorldMuseum museum = new ArtWorldMuseum(id,visitors);
        
        int n2 = sc.nextInt();
        int[] arr1 = new int[n2];
        for(int i=0;i<n2;i++) {
        	arr1[i]=sc.nextInt();
        }
        
        int singleDay = sc.nextInt();
        
        int n3 = sc.nextInt();
        int[] arr2 = new int[n3];
        for(int i=0;i<n3;i++)
        	arr2[i]=sc.nextInt();
        	
        System.out.println(museum.totalVisitors(arr1));     // Method 1
        System.out.println(museum.adjustedVisitors(singleDay)); // Method 2
        System.out.println(museum.totalPlusEvent(arr2));    // Method 3
        System.out.println(museum.getMuseumID());           // Getter for ID
        System.out.println(museum.getTotalVisitors());      // Getter for total visitors 
        sc.close();
	}

}
