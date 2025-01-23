package com.bo.java;

import java.util.*;

public class PM5_2_4 {
	public static void main(String[] args) {
		int ran1 = 0, ran2 = 0, correct = 0,count;
		Random ran = new Random();
		Input s = new Input();
		for(count=1;count<=10;count++) {
			ran1 = 1 + ran.nextInt(9);
			ran2 = 1 + ran.nextInt(9);
			System.out.printf("請輸入 %d * %d = ",ran1, ran2);
			int ans = s.getInt();
			if(ans == ran1 * ran2) {
				correct += 1;
			}
			else {
				System.out.println("答錯了 正確答案是"+(ran1*ran2));
			}
		}
		System.out.println("您得到"+(correct*10)+"分");
	}
}
