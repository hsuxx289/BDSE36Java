package com.bo.java;

public class Stars {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for (int i=1;i<=5;i++) {
			for (int k=2;k<=i;k++)
				System.out.print(" ");
			for (int j=6-i;j>0;j--)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.print("\n");
		int x=1;
		for (int i=1;i<=5;i++) {
			for (int k=5-i;k>0;k--)
				System.out.print(" ");
			for (int j=1;j<=x;j++)
				System.out.print("*");
			x+=2;
			System.out.print("\n");
		}
	}

}
