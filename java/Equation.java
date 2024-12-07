package com.bo.java;

import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input first number.");
		double a = scanner.nextDouble();
		System.out.println("Please input second number.");
		double b = scanner.nextDouble();
		System.out.println("Please input third number.");
		double c = scanner.nextDouble();
		scanner.close();
		double discriminant = b*b - 4*a*c;
		double squarediscriminant = Math.sqrt(discriminant);
		double root1 = (-b+squarediscriminant)/2*a;
		double root2 = (-b-squarediscriminant)/2*a;
		if (discriminant == 0)
			System.out.println(root1);
		else if (discriminant > 0) {
			System.out.println(root1);
			System.out.println(root2);
		}
		else 
			System.out.println("No real number root");
		
		
	}

}
