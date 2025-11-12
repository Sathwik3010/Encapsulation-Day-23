package com.codegnan.encapsulation;

import java.util.Scanner;


public class CityLibrary {

	private int bookID;
	private int overdueDays;
	
	
	public CityLibrary(int bookID, int overdueDays) {
		super();
		this.bookID = bookID;
		this.overdueDays = overdueDays;
	}

	
	public int getBookID() {
		return bookID;
	}


	public void setBookID(int bookID) {
		this.bookID = bookID;
	}


	public int getOverdueDays() {
		return overdueDays;
	}


	public void setOverdueDays(int overdueDays) {
		this.overdueDays = overdueDays;
	}

	public int fineByDays(int days) {
		int fine = days * 5;
		if(fine > 1000)
			fine = 1000;
		return fine;
	}
	
	public int fixedFine() {
		return 10;
	}
	
	public int fineByDaysPlusFixed(int days) {
		int fine = (days * 5) + 10;
		if(fine > 1000)
			fine = 1000;
		return fine;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bookID = sc.nextInt();
		int overdueDays = sc.nextInt();
		int days2 = sc.nextInt();
		sc.nextInt();
		int days3 = sc.nextInt();
		
		CityLibrary lib = new CityLibrary(bookID, overdueDays);
		
		System.out.println(lib.fineByDays(days2));
		System.out.println(lib.fixedFine());
		System.out.println(lib.fineByDaysPlusFixed(days3));
		System.out.println(lib.getBookID());
        System.out.println(lib.getOverdueDays());         // Output 5

		sc.close();
	}

}
