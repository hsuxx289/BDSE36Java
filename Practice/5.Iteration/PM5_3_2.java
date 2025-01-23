package com.bo.java;

public class PM5_3_2 {
	public static void main(String[] args) {
		Input s = new Input();
		System.out.println("請輸入一個正整數");
		int n = s.getInt();
		s.close();
		
		int sum = 0, count = 1;
		long sum1 = 1;
		while(count<=n) {
			sum += count;
			sum1 = sum1 *count; 
			count++;
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}
