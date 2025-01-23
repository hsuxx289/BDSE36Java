package com.bo.java;

public class PM5_2_3 {
	public static void main(String[] args) {
		int sum = 0, count;
		
		for(count=1;count<=1000;count++) {
			sum = sum + count;
		}
		System.out.println(sum);
		
		int sum1 = 0, count1;
		
		for(count1=100;count1>=1;count1--) {
			sum1 = sum1 + count1;
		}
		System.out.println(sum1);
		
		int sum2 = 0, count2;
		
		for(count2=0;count2<=1000;count2+=2) {
			sum2 = sum2 + count2;
		}
		System.out.println(sum2);
		
		int sum3 = 0, count3;
		
		for(count3=1;count3<1000;count3+=2) {
			sum3 = sum3 + count3;
		}
		System.out.println(sum2);
	}
}
