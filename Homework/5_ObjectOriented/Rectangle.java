package com.bo.java;

public class Rectangle implements Shape{
	private double l;
	
	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}
	
	private double w;
	
	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}
	
	private double area;
	private double circumference;
	
	public void computeArea() {
		area = l * w;
		System.out.println("The area of this rectangle is " + area);
	}
	public void computeCircumference() {
		circumference = 2 * (l+w);
		System.out.println("The circumference of this rectangle is " + circumference);
	}

}
