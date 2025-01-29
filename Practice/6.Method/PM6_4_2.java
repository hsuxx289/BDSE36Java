package com.bo.java;

public class PM6_4_2 {
	
	public static void main(String[] args) {
		Input s = new Input();
		int level = 0;
		
		System.out.println("== 曼波舞步表演系統 ==");
		System.out.printf("請輸入表演級數 => ");
		level = s.getInt();
		s.close();
		
		for(int i=1;i<=level;i++) {			
			System.out.printf("第 %d 階舞步 => ", i);
			frontStep(i);
			backStep(i);
			System.out.println("");
		}
		System.out.println("謝謝參觀");
	}
	public static void frontStep(int num) {
		if(num<=1) {
			System.out.printf("%d ",num);
		}
		else {
			frontStep(num-1);
			System.out.printf("%d ",num);
		}
	}
	public static void backStep(int num) {
		if(num<=1) {
			System.out.printf("%d ",num);
		}
		else {
			System.out.printf("%d ",num);
			backStep(num-1);
		}
	}
}

