package com.bo.java;

import java.util.*;

public class PM6_3_3 {
	static int max = 0, min = 99999;
	static String maxName = "", minName = "";
	
	public static void main(String[] args) {
		Input s = new Input();
		String name = "";
		
		System.out.println("歡迎光臨大吃小擲骰子遊戲\n");
		
		System.out.printf("請輸入玩家姓名=> ");
		name = s.getNextLine();
		
		while(name.length()!=0){
			dice(name);
			
			System.out.printf("擲出最大的是 %s, 點數是 %d\n", maxName,max);
			System.out.printf("請輸入玩家姓名=> ");
			name = s.getNextLine();
		
		}
		
		s.close();
		
		System.out.printf("擲出最大的是 %s, 點數是 %d\n", maxName,max);
		System.out.printf("擲出最小的是 %s, 點數是 %d\n", minName,min);
		
	}
	public static void dice(String name) {
		Random ran = new Random();
		int dice,sum=0;
		System.out.printf("擲出 => ");
		for(int i=1; i<=3; i++) {
			dice = 1 + ran.nextInt(6);
			System.out.printf("%d ", dice);
			sum += dice;			
		}
		System.out.printf("合計: %d\n", sum);
		if(sum == max || sum == min) {
			System.out.printf("點數相同請重新擲骰\n");
			dice(name);
		}
		if(sum>max && sum != max) {
			maxName = name;
			max = sum;
		}
		if(sum<min && sum != min) {
			minName = name;
			min = sum;
		}
	}
}

