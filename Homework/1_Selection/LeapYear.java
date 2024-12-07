package com.bo.java;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 輸入一西元年，如2015。判斷此年份是否為閏年。提示：每四年一閏，每百年不閏，每四百年一閏。
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a year.");
		int year = scanner.nextInt();
		scanner.close();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println("It is a leap year.");
		else
			System.out.println("It is not a leap year.");

	}

}
