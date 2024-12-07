package com.bo.ex;

import java.util.Scanner;

public class PM3_1_2 {

	public static void main(String[] args) {
		double stockprice = 0;
		double avgstockprice = 0;
		Scanner s = new Scanner(System.in);
		System.out.printf("*** 計算股價平均價系統 ***\n");
		for(int i=1; i<=5; i++) {
			System.out.printf("請輸入第%d個交易日股價 => ",i);
			stockprice += s.nextDouble();
			avgstockprice = stockprice/i;
			if(i==5)
				System.out.printf("(%d日平均價 = %3.2f)",i,avgstockprice);
			else
				System.out.printf("(目前平均價 = %3.2f)",avgstockprice);
		}
		s.close();
	

	}

}
