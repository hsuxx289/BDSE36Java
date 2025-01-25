package com.bo.java;

public class PM5_7_3 {
	public static void main(String[] args) {
		System.out.println("*** 退休金試算表(請提早準備) ***");
		System.out.println("*** 假設 60 歲退休、活到 80 歲退休生活 ***");
		System.out.println("* 退休後每月生活費、幾歲開始儲存、每月應存金額 *");
		System.out.println("\t2萬\t3萬\t4萬\t5萬");
		for(int i=30;i<=40;i+=5) {
			
			System.out.printf("%d歲",i);			
			
			for(int j=2;j<=5;j++) {
				double target = (double)(20 * j)/(60 - i);
				System.out.printf("\t%.2f",target);
			}
			System.out.printf("\n");
		}
	}
}
