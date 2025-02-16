package com.bo.java;

public class PM7_2_2 {

	public static void main(String[] args) {
		double course[] = {78.8, 72.3, 61, 56, 87, 
				66.3, 74.5, 88, 76, 58};
		double sum=0,avg=0;
		for(int i = 0; i < course.length; i++ ) {
			System.out.printf("%.2f  ",course[i]);
			sum += course[i];
			if(i==course.length-1) {
				System.out.printf("\n");
				avg = sum / course.length;
				System.out.printf("最近10天的平均價 = %.2f",avg);
				
			}
		}
	}

}
