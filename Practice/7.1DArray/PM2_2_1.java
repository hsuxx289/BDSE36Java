package com.bo.java;

public class PM2_2_1 {
	public static void main(String args[]) {
	
		double course[] = {78.8, 72.3, 61, 56, 87, 
				66.3, 74.5, 88, 76, 58};
		
		for(int i = 0; i < course.length; i++ ) {
			System.out.printf("%d \t%.2f\n",i+1, course[i]);
		}
		
	}
}
