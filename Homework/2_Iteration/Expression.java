package com.bo.java;

public class Expression {

	public static void main(String[] args) {
		// 利用for迴圏計算12-22+32-42+…+492-502的值。
		
		int x = 1;
		int sum = 0;
		
		for (int i=1; i<=50; i++) {
			sum += x*x;
			x++;
		}
		System.out.println(sum);
	}

}
