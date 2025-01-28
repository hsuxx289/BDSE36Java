package com.bo.java;

import java.util.*;

public class PM6_2_4 {
	public static void main(String[] args) {
		Input s = new Input();
		int max = 0;
		int[] num = new int[4];
		String[] player = new String[] {"東方","南方","西方","北方"};
		
		for(int i=0;i<=3;i++) {
		System.out.printf("請 %s 擲骰子 (按 Enter 鍵) =>",player[i]);
		s.getNextLine();
		num[i] = dice();
		System.out.printf("%s擲的是: %d\n",player[i],num[i]);
		}
		s.close();
		
		for(int i=0;i<=3;i++) {
			max = Max(num[i],max);
		}
		System.out.println("擲出最大的是 = " + max);
		
	}
	public static int Max(int x, int y) {
		int max;
		if(x>y) {
			max = x;
		}
		else {
			max = y;
		}
	
		return max;
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
		System.out.println("");
		return sum;
	}
}

