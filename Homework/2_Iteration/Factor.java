package com.bo.java;

import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		// 輸入一正整數，求其所有的因數。
		System.out.println("Please input a integer to find its factors.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		System.out.print("The factors are: ");
		for (int i=1; i<=num; i++) {
			if (num%i==0)
				System.out.print(i+" ");
		}

	}

}
