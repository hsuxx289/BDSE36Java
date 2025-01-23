package com.bo.java;

import java.util.Scanner;

public class PM3_1_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;
		int pop,cookie,banto;
		System.out.printf("超商收銀機、請注意是否歸零= %d \n",total);
		System.out.printf("請輸入汽水的金額 =>");
		pop = s.nextInt();
		total += pop;
		System.out.printf("  目前累進金額為 = %d \n",total);
		System.out.printf("請輸入餅乾的金額 =>");
		cookie = s.nextInt();
		total += cookie;
		System.out.printf("  目前累進金額為 = %d \n",total);
		System.out.printf("請輸入御便當的金額 =>");
		banto = s.nextInt();
		total += banto;
		System.out.printf("  目前累進金額為 = %d 謝謝光臨 !!!",total);
		s.close();

	}

}
