package com.bo.java;

public class test {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setR(1);
		c.computeArea();
		c.computeCircumference();
		
		Rectangle r = new Rectangle();
		r.setL(3);
		r.setW(4);
		r.computeArea();
		r.computeCircumference();
		
	}

}
