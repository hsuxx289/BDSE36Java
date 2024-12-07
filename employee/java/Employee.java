package com.bo.employee.java;

public abstract class Employee {
	//每個員工皆有姓名、性別、到職日、電話和email等基本資料
	String name;
	String gender;
	String hiredDate;
	String phone;
	String email;
	
	public Employee(String name,String gender,String hiredDate,String phone,String email){
		this.name = name;
		this.gender = gender;
		this.hiredDate = hiredDate;
		this.phone = phone;
		this.email = email;
	}
	
	public Employee() {
		
	}
	
	void printData() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Hired Date: " + hiredDate);
		System.out.println("Phone: " + phone);
		System.out.println("email: " + email);
	}
	abstract void printSalary();
		
	

}
