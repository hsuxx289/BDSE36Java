package com.bo.java;

public class PM5_5_2 {
	public static void main(String[] args) {
		Input s = new Input();
		System.out.println("請輸入矩形參數：");
		System.out.printf("請輸入矩形高度=> ");
		int height = s.getInt();
		System.out.printf("請輸入矩形寬度=> ");
		int width = s.getInt();
		
		for(int i=1;i<=height;i++) {			
			System.out.printf("    ");
			for (int j=1;j<=width;j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}
}
