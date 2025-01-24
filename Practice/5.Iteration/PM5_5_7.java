package com.bo.java;

public class PM5_5_7 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		
		while(i<=9) {
			j=2;
			while(j<=9) {
				System.out.printf("%d * %d = %d\t",j,i,i*j);
				j++;
			}
			i++;
			System.out.printf("\n");
			
		}
			
		
	}
}
