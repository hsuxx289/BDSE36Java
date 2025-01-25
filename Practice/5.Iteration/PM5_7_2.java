package com.bo.java;

public class PM5_7_2 {
	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("*** 歡迎光臨零存整付試算系統 ***\n");
		System.out.printf("預定每月儲存金額(如 10000)=> ");
		int savings = s.getInt();
		System.out.printf("存款期限(6,9,12,24)=> ");
		int term = s.getInt();
		System.out.printf("目前儲蓄年利率(如 0.15) => ");
		double rate = s.getDouble();
		double balance = 0;
		double interest = 0;
		
		for(int i=1; i<=term; i++) {
			balance += savings;
			balance += (balance*(rate/12));
		}
		
		interest = balance - savings * term;
		
		System.out.printf("到期可領回 %.0f 元",Math.ceil(balance));
		System.out.printf("增加 %.0f 元利息",Math.ceil(interest));
		s.close();
	}
}
