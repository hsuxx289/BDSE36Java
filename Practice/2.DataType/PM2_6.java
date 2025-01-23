package com.bo.java;

import java.util.Scanner;

public class PM2_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入大德先生/小姐姓名");
		String name = s.next();
		System.out.println("請輸入捐款金額");
		int amount = s.nextInt();
		s.close();
		System.out.println("列印收據如下:\n");
		System.out.println("**** 真自在遊民收容所 捐款收據 ****\n");
		System.out.printf("  感謝 %s 先生/小姐大德贊助\n",name);
		System.out.printf("      捐款 %d 元整\n\n",amount);
		System.out.println("**** 四海之內皆一家 順祝平安喜樂 ****");
		

	}

}
