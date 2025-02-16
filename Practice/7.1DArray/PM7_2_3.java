package com.bo.java;

public class PM7_2_3 {

	public static void main(String[] args) {
		double course[] = {78.8, 72.3, 61, 56, 87, 
				66.3, 74.5, 88, 76, 58};
		double max=-99999,min=99999;
		for(int i = 0; i < course.length; i++ ) {
			System.out.printf("%.2f  ",course[i]);
			if(course[i]>max) {
				max = course[i];
			};
			if(course[i]<min) {
				min = course[i];
			}
		}		
		System.out.printf("\n");
		System.out.printf("最近10天的最大值 = %.2f\n",max);
		System.out.printf("最近10天的最小值 = %.2f",min);
	}

}
