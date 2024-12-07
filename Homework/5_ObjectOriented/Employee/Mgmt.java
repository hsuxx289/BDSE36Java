package com.bo.employee.java;

public class Mgmt extends PermEmployee {
	double bonus;
	final double carAllowance = 3000;
	double mgmtMonthlySalary = permMonthlySalary + bonus + carAllowance;
	
	public Mgmt(String name,String gender,String hiredDate,String phone,String email,
				double baseSalary, double bonus) {
		super(name,gender,hiredDate,phone,email,baseSalary);
		this.bonus = bonus;
		this.mgmtMonthlySalary = permMonthlySalary + bonus + carAllowance;
	}
	public Mgmt() {
		
	}
	
	public void printData() {
		super.printData();
	}
	
	public void printSalary() {
		System.out.println("Monthly Wage: " + mgmtMonthlySalary);
	}
}
