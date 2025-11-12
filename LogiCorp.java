package com.codegnan.encapsulation;

import java.util.Scanner;

public class LogiCorp {

	private int shipmentID;
	private int[] weights;
	
	
	public LogiCorp(int shipmentID, int[] weights) {
		super();
		this.shipmentID = shipmentID;
		this.weights = weights;
	}

	
	public int getShipmentID() {
		return shipmentID;
	}


	public void setShipmentID(int shipmentID) {
		this.shipmentID = shipmentID;
	}


	public int getTotalWeights() {
		int total = 0;
		for(int w: weights)
			total+=w;
		if(total>5000)
			total=5000;
		return total;
	}


	public void setWeights(int[] weights) {
		this.weights = weights;
	}

	public int computeTotalWeight(int[] arr) {
		int sum =0;
		for(int w: arr)
			sum += w;
		if(sum > 5000)
			sum = 5000;
		return sum;
	}
	
	public int computeAdjustedWeight(int weight) {
		double adjusted = Math.floor(weight * 1.5);
		if(adjusted > 5000)
			adjusted = 5000;
		return (int) adjusted;
	}
	
	public int computeTotalPlusFixed(int[] arr) {
		int sum = 0;
		for(int w: arr)
			sum += w;
		sum += 50;
		if(sum > 5000)
			sum = 5000;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		
		int n = sc.nextInt();
		int[] weights = new int[n];
		for(int i=0;i<n;i++) {
			weights[i]=sc.nextInt();
		}
		
		LogiCorp shipment = new LogiCorp(id, weights);
		
		int n2 = sc.nextInt();
		int[] arr1 = new int[n2];
		for(int i=0;i<n2;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int singleWeight = sc.nextInt();
		
		int n3 = sc.nextInt();
		int[] arr2 = new int[n3];
		for(int i=0;i<n3;i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println(shipment.computeTotalWeight(arr1));
		System.out.println(shipment.computeAdjustedWeight(singleWeight));
		System.out.println(shipment.computeTotalPlusFixed(arr2));
		System.out.println(shipment.getShipmentID());
		System.out.println(shipment.getTotalWeights());
		sc.close();
	}

}
