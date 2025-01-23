package com.bo.java;

import java.util.Scanner;
import java.lang.Math;

public class PM3_5_1 {

	public static void main(String[] args) {
		
		System.out.println("*** 三個浮點數比較大小工具 ***");
		System.out.printf("請輸入三個浮點數(val1 val2 val3) =>");
		
		double[] value = new double[3];
		double max,min;
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<value.length;i++) {
			value[i] = s.nextDouble();
		}
		s.close();
		
		max = Math.max(value[0], Math.max(value[1], value[2]));
		min = Math.min(value[0], Math.min(value[1], value[2]));
		
		System.out.printf("最大數 =>%.2f",max);
		System.out.printf("最小數 =>%.2f",min);
		
	}

}
