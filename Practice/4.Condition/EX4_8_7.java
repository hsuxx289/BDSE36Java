package com.bo.java;

public class EX4_8_7 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入停車時間(小時)=> ");
		double hour = s.getDouble();
		int fee = 0;
		s.close();
		
		if (hour < 0.5) {
			System.out.println("不足半小時不收費!!");
		}
		else if (hour < 2) {
			System.out.println("2小時以內皆為50元!!");
		}
		else if (hour > 2) {
			fee = 50 + (int)(Math.ceil(hour-2))*20;
			System.out.println("費用為:"+ fee);
		}
		

	}

}
