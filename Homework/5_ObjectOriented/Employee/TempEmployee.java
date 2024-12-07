package com.bo.employee.java;

public class TempEmployee extends Employee {
	double hour;
	double hourlyWage;
	
	public TempEmployee(String name,String gender,String hiredDate,String phone,String email,double hour, double hourlyWage) {
		super(name,gender,hiredDate,phone,email);
		this.hour = hour;
		this.hourlyWage = hourlyWage;
	}
	public TempEmployee() {
		
	}
	
	public void printData() {
		super.printData();
	}
	
	public void printSalary() {
		System.out.println("Monthly Wage: " + hour*hourlyWage);
	}
}
