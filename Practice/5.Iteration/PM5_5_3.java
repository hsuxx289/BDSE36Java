package com.bo.java;

public class PM5_5_3 {
	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入等邊三角形高度=> ");
		int height = s.getInt();
		s.close();
		System.out.println("畫出左邊的等邊三角形高度：" + height);
		for(int i=1;i<=height;i++) {			
			for (int j=1;j<=(height-i);j++) {
				System.out.printf(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("畫出反左邊的等邊三角形高度：" + height);
		for(int i=height;i>=1;i--) {			
			for (int j=1;j<=(height-i);j++) {
				System.out.printf(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("畫出右邊的等邊三角形高度：" + height);
		for(int i=1;i<=height;i++) {			
			for (int k=1;k<=i;k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("畫出反向右邊的等邊三角形高度：" + height);
		for(int i=1;i<=height;i++) {			
			for (int j=1;j<=(height-i);j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}
}
