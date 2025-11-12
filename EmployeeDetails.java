package com.codegnan.encapsulation;

public class EmployeeDetails {
	private int empId;
	private String name;
	private double salary;
	
	public int getempId() {
		return empId;
	}
	
	public void setempId(int empId) {
		this.empId = empId;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public void setsalary(double salary) {
		if(salary>=0) {
			this.salary = salary;
		} else {
			System.out.println("Salary should be positive");	
		}
	}
	
	public EmployeeDetails(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void displayEmpInfo() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails(111,"arjun", 60000);
		emp.displayEmpInfo();
		emp.setempId(222);
		emp.setname("malli");
		emp.setsalary(79000.89);
		System.out.println(emp.getempId());
		System.out.println(emp.getname());
		System.out.println(emp.getsalary());
	}
}
