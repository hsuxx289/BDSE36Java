package com.bo.employee.java;

public class Sales extends PermEmployee {
	double incentive;
	double salesMonthlySalary = permMonthlySalary + incentive;
	
	public Sales(String name,String gender,String hiredDate,String phone,String email,
			double baseSalary, double incentive) {
	super(name,gender,hiredDate,phone,email,baseSalary);
		this.incentive = incentive;
		this.salesMonthlySalary = permMonthlySalary + incentive;
	}
	public Sales() {
	
	}
	
	public void printData() {
		super.printData();
	}
	
	public void printSalary() {
		System.out.println("Monthly Wage: " + salesMonthlySalary);
	}
}
