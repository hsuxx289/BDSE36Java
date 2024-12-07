package com.bo.java;

public class PerfectNumber {

	public static void main(String[] args) {
		// 找出100以內所有的完美數。
		int sum=0;
		for (int i=2;i<=100;i++) {
			for (int j=1; j<i; j++) {
				if (i%j==0)
					sum+=j;
			}
			if (sum==i) 
				System.out.print(i+" ");
			sum = 0;
		}
	}		

}
