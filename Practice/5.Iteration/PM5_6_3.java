package com.bo.java;

public class PM5_6_3 {
	public static void main(String[] args) {
		final int target = 100;
		boolean prime;
		int i = 2;
		int count = 0;
		System.out.println("列印出 1~100 間的質數如下：\n");
		while(i<=target) {
			prime = true;
			int j = 2;
			while(j<=(i/2)) {
				if((i%j)==0) {
					prime = false;
					break;
				}
				j++;
			}
			if(prime) {
				System.out.printf("%d\t", i);
				count++;
				if(count%10==0) {
					System.out.printf("\n");
				}				
			}
			i++;
			
		}
	}
}
