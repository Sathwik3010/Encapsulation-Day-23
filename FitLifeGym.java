package com.codegnan.encapsulation;

import java.util.Scanner;

public class FitLifeGym {
	 private int memberID;
	 private int steps;
	 
	 
	public FitLifeGym(int memberID, int steps) {
		super();
		this.memberID = memberID;
		this.steps = steps;
	}

	
	public int getMemberID() {
		return memberID;
	}


	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}


	public int getSteps() {
		return steps;
	}


	public void setSteps(int steps) {
		this.steps = steps;
	}

	public int calcFromSteps(int steps) {
		int calories = (int) Math.floor(steps * 0.05);
		if(calories > 1000)
			calories = 1000;
		return calories;
	}
	
	public int calcFixed() {
		return 10;
	}
	
	public int calcStepsPlusFixed(int steps) {
		int calories = (int) Math.floor((steps * 0.05)+10);
		if(calories > 1000)
			calories = 1000;
		return calories;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int memberID = sc.nextInt();
        int steps = sc.nextInt();
        int steps2 = sc.nextInt();
        sc.nextInt();
        int steps3 = sc.nextInt();

        FitLifeGym members = new FitLifeGym(memberID, steps);
        
        System.out.println(members.calcFromSteps(steps2));
        System.out.println(members.calcFixed());                // Output 2
        System.out.println(members.calcStepsPlusFixed(steps3)); // Output 3
        System.out.println(members.getMemberID());
        System.out.println(members.getSteps());
        
		sc.close();
	}

}
