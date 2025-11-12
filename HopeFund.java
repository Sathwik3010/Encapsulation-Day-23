package com.codegnan.encapsulation;

import java.util.Scanner;

public class HopeFund {
	private int donorID;
    private int donationAmount;

	public HopeFund(int donorID, int donationAmount) {
		super();
		this.donorID = donorID;
		this.donationAmount = donationAmount;
	}

	
	public int getDonorID() {
		return donorID;
	}


	public void setDonorID(int donorID) {
		this.donorID = donorID;
	}


	public int getDonationAmount() {
		return donationAmount;
	}


	public void setDonationAmount(int donationAmount) {
		this.donationAmount = donationAmount;
	}

	public int matchByAmount(int amount) {
		int match = amount * 2;
		if(match >10000)
			match = 10000;
		return match;
	}
	
	public int fixedMatch() {
	        return 50;
	}
	  
	public int matchByAmountPlusFixed(int amount) {
			int match = (amount * 2)+50;
			if(match > 10000)
				match = 10000;
			return match;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int donorID = sc.nextInt();
        int donationAmount = sc.nextInt();
        int amount2 = sc.nextInt(); // for method 1
        sc.nextInt();               // dummy input for method 2
        int amount3 = sc.nextInt(); // for method 3

        HopeFund donor = new HopeFund(donorID, donationAmount);
        
        System.out.println(donor.matchByAmount(amount2));         // Output 1
        System.out.println(donor.fixedMatch());                   // Output 2
        System.out.println(donor.matchByAmountPlusFixed(amount3));// Output 3
        System.out.println(donor.getDonorID());                   // Output 4
        System.out.println(donor.getDonationAmount());            // Output 5
        sc.close();	
	}

}
