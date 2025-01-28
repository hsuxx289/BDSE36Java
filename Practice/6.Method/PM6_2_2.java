package com.bo.java;

public class PM6_2_2 {
	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入第一個整數 => ");
		int var1 = s.getInt();
		System.out.printf("請輸入第二個整數 => ");
		int var2 = s.getInt();
		s.close();
		
		int sum = Add(var1,var2);
		
		System.out.printf("%d + %d = %d",var1,var2,sum);
	}
	public static int Add(int x, int y) {
		int sum = x + y;
		return sum;
	}
}

