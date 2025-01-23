package com.bo.java;

import java.util.Scanner;

public class PM2_6_3 {

	public static void main(String[] args) {
		final double oilPrice = 28.5;
		double oilAmount,totalPrice;
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入加油總量");
		oilAmount = s.nextDouble();
		s.close();
		totalPrice = oilPrice * oilAmount;
		System.out.printf("應收金額 = %.0f",totalPrice);
		

	}

}
