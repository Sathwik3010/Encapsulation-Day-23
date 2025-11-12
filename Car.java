package com.codegnan.encapsulation;

public class Car {

	private String model;
	private int year;
	
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setModel("ciaz");
		c.setYear(2015);
		System.out.println("Model: "+c.getModel());
		System.out.println("Year: "+c.getYear());

	}

}
