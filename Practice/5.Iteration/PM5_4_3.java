package com.bo.java;

public class PM5_4_3 {
	public static void main(String[] args) {
		final int term = 240;
		double rate = 0;
		double payment = 0;
		int count = 0;
		double balance = 0;
		Input s = new Input();
		
		System.out.println("== 歡迎光臨藝術銀行貸款試算系統 ==");
		System.out.printf("請輸入貸款金額 (萬) => ");
		balance = s.getDouble();
		System.out.printf("請輸入年利率 (如0.04) => ");
		rate = s.getDouble();
		System.out.printf("期望每月還款額度 (萬) => ");
		payment = s.getDouble();
		
		do {
			balance += (balance * rate)/12 - payment;
			count++;
		}while(balance>0);
		
		System.out.printf("您需要 %d 期(月) 才可還款完畢\n",count-1);
		if(count>term)
			System.out.printf("超過期數 %d 請另選貸款額度\n",term);
		else
			System.out.println("本行願意承做, 歡迎洽詢行員\n");
	}
}
