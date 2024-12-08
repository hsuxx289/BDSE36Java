package com.bo.java;

public class EX4_2 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入一個浮點數 =>");
		double value = s.getDouble();
		if (value>0) {
			double square = Math.sqrt(value);
			System.out.printf("%.2f 的平方根值為 = %.2f\n",value,square);
		}
		else
			System.out.println("不計算虛數");
		s.close();
		System.out.printf("程式結束了");
	}

}
