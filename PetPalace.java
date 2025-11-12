package com.codegnan.encapsulation;

import java.util.Scanner;

public class PetPalace {

	private int petID;
	private int qunatity;
	
	
	public PetPalace(int petID, int qunatity) {
		super();
		this.petID = petID;
		this.qunatity = qunatity;
	}

	
	public int getPetID() {
		return petID;
	}


	public void setPetID(int petID) {
		this.petID = petID;
	}


	public int getQunatity() {
		return qunatity;
	}


	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}


	public int computeCostByQuantity(int qunatity) {
		int cost = qunatity * 2;
		if(cost >1000)
			cost = 1000;
		return cost;
	}
	
	public int computeFixedCost() {
		return 15;
	}
	
	public int computeQuantityPlusFixed(int qunatity) {
		int cost = (qunatity * 2)+15;
		if(cost > 1000)
			cost = 1000;
		return cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int petID = sc.nextInt();
		int qunatity = sc.nextInt();
		int qunatity2 = sc.nextInt();
		sc.nextInt();
		int qunatity3 = sc.nextInt();
		
		PetPalace pet = new PetPalace (petID, qunatity);
		
		System.out.println(pet.computeCostByQuantity(qunatity2));     // Output 1
        System.out.println(pet.computeFixedCost());                   // Output 2
        System.out.println(pet.computeQuantityPlusFixed(qunatity3));  // Output 3
        System.out.println(pet.getPetID());                           // Output 4
        System.out.println(pet.getQunatity());                        // Output 5

		sc.close();
	}

}
