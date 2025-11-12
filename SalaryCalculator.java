package com.codegnan.encapsulation;

public class SalaryCalculator {
	
	 private int empId;
	 private int workingDays;
	 
	 
	public int getEmpId() {
		return empId;
	}


	 public void setEmpId(int empId) {
		 this.empId = empId;
	 }


	 public int getWorkingDays() {
		 return workingDays;
	 }


	 public void setWorkingDays(int workingDays) {
		 this.workingDays = workingDays;
	 }

	 public int salaryByDays(int days) {
		 int salary=days*1000;
		return Math.min(salary, 100000);
	 }

	 // method1 calculate Salary days*1000;
//	public SalaryCalculator(int empId, int workingDays) {
//		super();
//		this.empId = empId;
//		this.workingDays = workingDays;
//	}
	
	//fixed bonus 2000 rupess
	public int fixedBonus() {
		return 2000;
	}
	
	public int salaryByDaysPlusBonus(int days) {
		int salary=days*1000+2000;
		return Math.min(salary, 100000);
	}
}
