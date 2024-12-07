package com.bo.java;

public class Circle implements Shape{
	private double r;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	double area;
	double circumference;
	
	public void computeArea() {
		area = r * r * PI;
		System.out.println("The area of this circle is " + area);
	}
	public void computeCircumference() {
		circumference = 2 * r * PI;
		System.out.println("The circumference of this circle is " + circumference);
	}

}
