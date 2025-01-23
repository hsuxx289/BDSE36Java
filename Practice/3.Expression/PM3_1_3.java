package com.bo.java;

import java.util.Scanner;

public class PM3_1_3 {

	public static void main(String[] args) {
		String[] course = new String[] {"電腦概論","程式設計","離散數學","國文","英文"};
		int[] credit = new int[] {2,3,3,2,2};
		int sum = 0;
		int totalcredit = 0;
		double average = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("*** 學期成績計算系統(各學科分數)***");
		for(int i=0;i<5;i++) {
			System.out.printf("請輸入%s成績(%d學分) =>",course[i],credit[i]);
			sum += s.nextInt() * credit[i];
		}
		s.close();
		for(int n:credit)
			totalcredit += n;
		average = (double)sum / totalcredit;
		System.out.printf("學期總平均分數 = %2.2f\n",average);
		System.out.printf("四捨五入後成績 = %d",(int)average);
	}

}
