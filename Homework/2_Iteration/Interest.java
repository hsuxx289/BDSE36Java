package com.bo.java;

public class Interest {

	public static void main(String[] args) {
		/* 錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。(27年後)
		提示：單利公式：P(1+r*n)    複利公式：P(1+r)n
		P：本金，r：利率，n：多少年*/
		int p = 100000;
		int n=0;
		int money=p;
		int how=p;
		
		while (how<=money) {
			how *= 1.05;
			money += p*0.1;
			n++;
		}
		System.out.print(n+" "+ money +" "+ how);

	}

}
