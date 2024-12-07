package com.bo.java;

public class MaxMin {

	public static void main(String[] args) {
		// 事先將10個數字置於一維陣列中，分別找出10個數字中最大的值和最小的值。
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<10;i++) {
			if (a[i]>max)
				max = a[i];
			else if(a[i]<min)
				min = a[i];
		}
		System.out.println("Maxium number is " + max);
		System.out.println("Minimum number is " + min);

	}

}
