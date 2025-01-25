package com.bo.java;

public class PM5_7_4 {
	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("*** 評估退休後生活品質系統 ***\n");
		System.out.printf("請輸入幾歲開始儲存退休金(如 30)歲 => ");
		int startAge= s.getInt();
		System.out.printf("請問幾歲準備退休(如 60)歲 => ");
		int retiredAge = s.getInt();
		System.out.printf("請輸入預估年利率(如 0.14) => ");
		double rate = s.getDouble();
		System.out.printf("請輸入預估每月儲蓄(如 10000)元 => ");
		int savings = s.getInt();
		double balance = 0;
		double annuity = 0;
		s.close();
		
		for(int i=1; i<=(retiredAge-startAge)*12; i++) {
			balance += savings;
			balance += (balance*(rate/12));
		}
		
		annuity = balance/((80-retiredAge)*12);
		
		System.out.printf("到退休之前可儲存 %.0f 元\n",Math.ceil(balance));
		System.out.printf("平均每個月有 %.0f 元生活費\n",Math.ceil(annuity));
		
		if(annuity>=40000)
			System.out.println("遨遊世界。");
		else if(annuity>=20000)
			System.out.println("富貴生活。");
		else if(annuity>=10000)
			System.out.println("安逸舒適。");
		else if(annuity>=5000)
			System.out.println("勉強可以湖口。");
		else
			System.out.println("等待救濟。");
	}
}
