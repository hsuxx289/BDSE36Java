package com.bo.java;

public class PM5_4_2 {
	public static void main(String[] args) {
		int count=100, sum=0;
		
		do {
			sum += count;
			count--;
		}while(count>0);
		System.out.println(sum);
	}
}
