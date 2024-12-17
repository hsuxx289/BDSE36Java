package com.bo.java;

public class EX4_8_3 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入公里數=>");
		double mileage = s.getDouble();
		s.close();
		int fare = 0;
		if(mileage<=3) {
			fare = 70;
		}
		else { 
			fare = 70 + (int)((mileage-3)/0.5)*10;
		}
		System.out.printf("搭車費用為 => %d元",fare);
	}

}
