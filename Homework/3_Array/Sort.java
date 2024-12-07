package com.bo.java;

public class Sort {

	public static void main(String[] args) {
		// T事先將10個數字置於一維陣列中，以下列三種方式遞增排序。
		//(1)	Bubble sort
		int[] a = {7,5,6,1,3,2,4,8,10,9};
		int temp = 0;
		for (int i=a.length-1; i>0; i--) {
            for (int j=0; j<a.length-1; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
		for(int n:a)
			System.out.print(n+" ");
		System.out.println(" ");
		//(2) Selection sort  
		int[] b = {7,5,6,1,3,2,4,8,10,9};
		temp = 0;
		int index;
		int min;
		for (int i=0;i<b.length-1;i++) {
			min = b[i];
			index = i;
			for (int j=i+1; j<b.length; j++) {
				if (b[j]<min) {
					min = b[j];
					index = j;
				}
			}
                 temp = b[i];
                 b[i] = b[index];
                 b[index] = temp;
                 
             
        }
		for(int n:b)
			System.out.print(n+" ");
		System.out.println(" ");
		
		//(3) Insertion sort
		int[] c = {7,5,6,1,3,2,4,8,10,9};
		int j = 0;
		for(int i=1;i<c.length;i++) {
			temp = c[i];
			j=i-1;
			while(j>=0 && temp<c[j]) {
				c[j+1] = c[j];
				j--;
			}
			c[j+1]=temp;
			
		}
		for(int n:c)
			System.out.print(n+" ");

	}

}
