package com.bo.java;

import java.util.*;

public class PM6_2_5 {
	public static void main(String[] args) {
		Input s = new Input();
		int max = 0;
		String maxName = "";
		
		for(int i=1;i<=4;i++) {
		System.out.printf("請輸入玩家姓名=> ");
		String name = s.getString();
		int num = dice();
		if (num>max) {
			maxName = name;
			max = num;
		}
		}
		s.close();
		
		System.out.printf("擲出最大的是 %s, 點數是 %d ", maxName,max);
		
	}
	public static int dice() {
		Random ran = new Random();
		int dice,sum=0;
		System.out.printf("擲出 => ");
		for(int i=1; i<=3; i++) {
			dice = 1 + ran.nextInt(6);
			System.out.printf("%d ", dice);
			sum += dice;			
		}
		System.out.printf("合計: %d", sum);
		System.out.println("");
		return sum;
	}
}

