package com.bo.java;

public class EX4_8_6 {
	public static void main(String[] args) {
		
		Input s = new Input();
		System.out.printf("請輸入期中考成績=>");
		int midterm = (int)(s.getInt()*0.3);		
		System.out.printf("請輸入期末考成績=>");
		int finalterm = (int)(s.getInt()*0.3);
		System.out.printf("請輸入平常成績=>");
		int test = (int)(s.getInt()*0.4);
		s.close();
		int total = midterm + finalterm + test;
		char grade = ' ';
		
		if (total>=90)
			grade = 'A';
		else if (total >= 80)
			grade = 'B';
		else if (total >= 70)
			grade = 'C';
		else if (total >= 60)
			grade = 'D';
		else
			grade = 'E';
		
		System.out.println("總成績評量為 "+ grade);
	}
}
