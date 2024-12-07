package com.bo.employee.java;

public class PermEmployee extends Employee {
	double baseSalary;
	final double mealAllowance = 2400;
	double permMonthlySalary;
	
	public PermEmployee(String name,String gender,String hiredDate,String phone,String email,double baseSalary) {
		super(name,gender,hiredDate,phone,email);
		this.baseSalary = baseSalary;
		this.permMonthlySalary=baseSalary + mealAllowance;
	}
	public PermEmployee() {
		
	}
	public void printData() {
		super.printData();
	}
	
	public void printSalary() {
		System.out.println("Monthly Salary: " + (permMonthlySalary));
	}
}
