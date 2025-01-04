package com.bo.java;

public class EX4_8_8 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入使用度數=> ");
		int electricity = s.getInt();
		s.close();
		int bill = 0;
		if (electricity <= 50) {
			bill = 150;
			System.out.println("電費應收取=> "+ bill +"元");
		}
		else if (electricity <= 100) {
			bill = 150 + (electricity-50) * 5;
			System.out.println("電費應收取=> "+ bill +"元");
		}
		else if (electricity <= 150) {
			bill = 150 + 50 * 5 + (electricity-100)*6;
			System.out.println("電費應收取=> "+ bill +"元");
		}
		else if (electricity <= 200) {
			bill = 150 + 50 * 5 + 50*6 + (electricity-150)*7;
			System.out.println("電費應收取=> "+ bill +"元");
		}
		else if (electricity > 200) {
			bill = 150 + 50 * 5 + 50*6 + 50*7 +(electricity-200)*8;
			System.out.println("電費應收取=> "+ bill +"元");
		}
	}

}
