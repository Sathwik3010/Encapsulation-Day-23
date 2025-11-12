package com.codegnan.encapsulation;

import java.util.Scanner;

public class GadgetHub {

	private int inventoryID;
	private int[] prices;
	
	
	public GadgetHub(int inventoryID, int[] prices) {
		super();
		this.inventoryID = inventoryID;
		this.prices = prices;
	}

	
	public int getInventoryID() {
		return inventoryID;
	}


	public void setInventoryID(int inventoryID) {
		this.inventoryID = inventoryID;
	}


	public int getTotalPrices() {
		int sum = 0;
		for(int p: prices)
			sum += p;
		if(sum > 10000)
			sum = 10000;
		return sum;
	}


	public void setPrices(int[] prices) {
		this.prices = prices;
	}

	public int computeTotalValue(int [] arr) {
		int sum=0;
		for(int p: arr)
			sum+= p;
		if(sum>10000)
			sum=10000;
		return sum;
	}
	
	public int computeAdjustedValue(int price) {
		int value = (int) Math.floor(price * 1.1);
		if(value>10000)
			value=10000;
		return value;
	}
	
	public int computeTotalPlusFixed(int[] arr) {
		int sum = 0;
		for(int p: arr)
			sum+=p;
		sum+=100;
		if(sum>10000)
			sum=10000;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		int n = sc.nextInt();
		int[] prices = new int[n];
		for(int i=0;i<n;i++) {
			prices[i]=sc.nextInt();
		}
		
		GadgetHub g = new GadgetHub(id, prices);
		
		int n2 = sc.nextInt();
		int[] arr1 = new int[n2];
		for(int i=0;i<n2;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int price = sc.nextInt();
		
		int n3 = sc.nextInt();
		int[] arr2 = new int[n3];
		for(int i=0;i<n3;i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println(g.computeTotalValue(arr1));
		System.out.println(g.computeAdjustedValue(price));
		System.out.println(g.computeTotalPlusFixed(arr2));
		System.out.println(g.getInventoryID());
		System.out.println(g.getTotalPrices());
		
		sc.close();
	}

}
