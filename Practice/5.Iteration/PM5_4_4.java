package com.bo.java;

public class PM5_4_4 {
	public static void main(String[] args) {
		int term = 0;
		double rate = 0;
		double payment = 0;
		double pay = 0;
		int count = 0;
		double credit = 0;
		double balance = 0;
		double interest = 0;
		double interestSum = 0;
		int stage = 0;
		Input s = new Input();
		
		System.out.println("== 學貸償還試算系統 ==");
		System.out.printf("請輸入貸款金額 (萬) => ");
		credit = s.getDouble();
		System.out.printf("請輸入年利率 (如0.04) => ");
		rate = s.getDouble();
		System.out.printf("償還年限(貸款學期數) => ");
		term = s.getInt();
		
		stage = term * 12;
		pay = credit/stage;
		balance = credit;
		System.out.println("前 10 期應繳納金額如下：");
		do {
			interest = (balance*rate)/12;
			payment = pay + interest;
			balance -= pay;
			interestSum += interest;
			count++;
			if(count<=10)
			System.out.printf("您第 %d 期需繳納 %.2f 萬元\n",count,payment);
		}while(count<stage);
		
		System.out.printf("到清償為止，總共延伸利息 %.2f 萬元\n",interestSum);
	}
}
