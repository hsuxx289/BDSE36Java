package com.bo.java;

import java.util.*;

public class EX4_5_3 {

	public static void main(String[] args) {
		Input s = new Input();
		Random r = new Random();
		int x = r.nextInt(9) + 1;
		int y = r.nextInt(9) + 1;
		int ans = x*y;
		
		System.out.printf("請輸入 %d * %d => ",x,y);
		int z = s.getInt();
		s.close();
		if (z == ans) {
			System.out.println("答對了 你好棒 !!");
		}
		else
			System.out.printf("答錯了 正確答案是 %d 多加油喔 !!", ans);


	}

}
