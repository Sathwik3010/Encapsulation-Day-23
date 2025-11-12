package com.codegnan.encapsulation;

import java.util.Scanner;

public class CityLibrary2 {

	 private int memberID;
	 private int[] loanDays;
	 
	 
	public CityLibrary2(int memberID, int[] loanDays) {
		super();
		this.memberID = memberID;
		this.loanDays = loanDays;
	}

	
	public int getMemberID() {
		return memberID;
	}


	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}


	public int getTotalLoanDays() {
		int total = 0;
		for(int d : loanDays)
			total += d;
		if(total > 365)
			total = 365;
		return total;
	}


	public void setLoanDays(int[] loanDays) {
		this.loanDays = loanDays;
	}

	public int totalLoanDays(int[] arr) {
		int sum = 0;
		for(int d : arr)
			sum += d;
		if(sum>365)
			sum=365;
		return sum;
	}
	
	public int extendedLoan(int singleDay) {
		int extended = singleDay + 2;
		if(extended > 365)
			extended = 365;
		return extended;
	}
	
	public int totalPlusOverhead(int[] arr) {
		int sum = 0;
		for(int d: arr)
			sum+=d;
		sum+=5;
		if(sum>365)
			sum=365;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		int n = sc.nextInt();
		int[] days = new int[n];
		for(int i=0;i<n;i++) {
			days[i]=sc.nextInt();
		}
		
		CityLibrary2 member = new CityLibrary2(id, days);
		
		int n2 = sc.nextInt();
		int[] arr1 = new int[n2];
		for(int i=0;i<n2;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int singleLoan = sc.nextInt();
		
		int n3 = sc.nextInt();
		int[] arr2 = new int[n3];
		for(int i=0;i<n3;i++) {
			arr2[i]=sc.nextInt();
		}
		
		   System.out.println(member.totalLoanDays(arr1));   // Method 1
	        System.out.println(member.extendedLoan(singleLoan)); // Method 2
	        System.out.println(member.totalPlusOverhead(arr2));  // Method 3
	        System.out.println(member.getMemberID());         // Member ID
	        System.out.println(member.getTotalLoanDays());    // Total loan days (from setter)
		sc.close();
	}

}
