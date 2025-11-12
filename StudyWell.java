package com.codegnan.encapsulation;

import java.util.Scanner;

public class StudyWell {
	
	private int studentID;
	private int[] grades;
	
	
	public StudyWell(int studentID, int[] grades) {
		super();
		this.studentID = studentID;
		this.grades = grades;
	}

	
	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public int getTotalGrades() {
		int sum = 0;
		for(int g: grades)
			sum+=g;
		return sum;
	}


	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public int computeAverage(int[] arr) {
		if(arr.length == 0)
			return 0;
		int sum =0;
		for(int g: arr)
			sum+=g;
		int avg = (int) Math.floor((double)sum/arr.length);
		if(avg>100)
			avg = 100;
		return avg;
	}
	
	public int adjustGrade(int grade) {
		int newGrade = grade + 5;
		if(newGrade > 100)
			newGrade = 100;
		return newGrade;
	}
	
	public int computeAveragePlusBonus(int[] arr) {
		if(arr.length == 0)
			return 0;
		int sum =0;
		for(int g: arr)
			sum+=g;
		int avg = (int) Math.floor((double)sum/arr.length);
		avg+=10;
		if(avg>100)
			avg = 100;
		return avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        
        int n =sc.nextInt();
        int[] grades = new int[n];
        for(int i=0;i<n;i++) {
        	grades[i]=sc.nextInt();
        }
        
        StudyWell s = new StudyWell(id, grades);
        
        int n2 =sc.nextInt();
        int[] arr1 = new int[n2];
        for(int i=0;i<n2;i++) {
        	arr1[i]=sc.nextInt();
        }
        
        
        int grade = sc.nextInt();
        
        int n3 = sc.nextInt();
        int[] arr2 = new int[n3];
        for(int i=0;i<n3;i++) {
        	arr2[i]=sc.nextInt();
        }
        
        System.out.println(s.computeAverage(arr1));
        System.out.println(s.adjustGrade(grade));
        System.out.println(s.computeAveragePlusBonus(arr2));
        System.out.println(s.getStudentID());
        System.out.println(s.getTotalGrades());
        
        sc.close();
	}

}
