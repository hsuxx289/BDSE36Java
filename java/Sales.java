package com.bo.java;

public class Sales {

	public static void main(String[] args) {
		// a.	每一個銷售員的銷售總金額
		//b.	有最好業績（銷售總金額最多者）的銷售員
		//c.	每一項產品的銷售總金額
		//d.	銷售總金額最多的產品

		int[][] a ={{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
		int[] b = new int[3];
		int[] c = new int[5];
		int sum=0;
		int max=0;
		int sump=0;
		int maxp=0;
		int top=0;
		int topp=0;
		String[] name = {"Jean","Tom","Tina"};
		char[] product = {'A','B','C','D','E'};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
			b[i]=sum;
			System.out.println("The sum of "+name[i]+" is "+b[i]);
			sum = 0;
			if (b[i]>max) {
				max = b[i];
				top = i;
			}
		}
		System.out.println("The top sales is "+name[top]);
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				sump+=a[j][i];
			}
			c[i]=sump;
			System.out.println("The sum of "+product[i]+" is "+c[i]);
			sump = 0;
			if (c[i]>maxp) {
				maxp = c[i];
				topp = i;
			}
		}
		System.out.println("The top product is "+product[topp]);
	}

}
