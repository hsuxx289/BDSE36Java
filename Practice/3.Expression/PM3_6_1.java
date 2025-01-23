package com.bo.java;

import java.util.Scanner;

public class PM3_6_1 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.printf("請輸入華式溫度 =>");
		double fdegree = s.nextDouble();
		double cdegree = (fdegree - 32) * 5 / 9;
		System.out.printf("華氏 %.2f 度= 攝氏 %.2f 度\n",fdegree,cdegree);
		System.out.printf("請輸入攝式溫度 =>");
		cdegree = s.nextDouble();
		fdegree = 32 + (9*cdegree)/5;
		System.out.printf("攝氏 %.2f 度= 華氏 %.2f 度\n",cdegree,fdegree);
		s.close();

	}

}
