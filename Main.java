package com.codegnan.encapsulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SalaryCalculator sc = new SalaryCalculator(101, 30);
//		System.out.println("Id: "+sc.empId+", days: "+sc.workingDays);

		Scanner sc = new Scanner(System.in);
		
		SalaryCalculator s = new SalaryCalculator();
		int id=sc.nextInt();
		int days=sc.nextInt();
		int d1=sc.nextInt();
		sc.nextInt();
		int d2=sc.nextInt();
		s.setEmpId(id);
		s.setWorkingDays(days);
		
		System.out.println(s.salaryByDays(d1));
		System.out.println(s.fixedBonus());
		System.out.println(s.salaryByDaysPlusBonus(d2));
		System.out.println(s.getEmpId());
		System.out.println(s.getWorkingDays());
		sc.close();
	}

}
