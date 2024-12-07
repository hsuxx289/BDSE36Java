package com.bo.java;

import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// 輸入一正整數，找出所有小於或等於的質數。
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number.");
		int num = scanner.nextInt();
		scanner.close();
		boolean prime = true;
		
		for(int i=2;i<+num;i++) {	
			for (int j=2;j*j<=i;j++) {
				if (i%j==0)
				prime = false;
			}
			if (prime)
			System.out.print(i+" ");
			prime = true;
		}
	}

}
