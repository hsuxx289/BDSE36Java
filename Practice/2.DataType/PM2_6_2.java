package com.bo.ex;

import java.util.Scanner;

public class PM2_6_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入第一個整數");
		int x = s.nextInt();
		System.out.println("請輸入第二個整數");
		int y = s.nextInt();
		s.close();
		int sum = x + y;
		System.out.printf("%d + %d = %d",x,y,sum);
		

	}

}
