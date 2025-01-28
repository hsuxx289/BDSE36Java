package com.bo.java;

public class PM6_2_3 {
	public static void main(String[] args) {
		Input s = new Input();
		int min = 60000000;
		int max = -60000000;
		int value;
		for(int i=1; i<=5; i++) {
			System.out.printf("請輸入第%d個正整數 => ", i);
			value = s.getInt();
			max = Max(max,value);
			min = Min(min,value);
		}
		s.close();
		System.out.println("最大數是 "+ max);
		System.out.println("最小數是 "+ min);

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
	public static int Min(int x, int y) {
		int min;
		if(x<y) {
			min = x;
		}
		else {
			min = y;
		}
	
		return min;
	}
}

