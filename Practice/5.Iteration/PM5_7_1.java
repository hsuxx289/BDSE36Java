package com.bo.java;

public class PM5_7_1 {
	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入該月 1 日星期幾(1 ~ 7)=> ");
		int day = s.getInt();
		System.out.printf("請輸入該月的天數(28~31)=> ");
		int date = s.getInt();
		int count = 1;
		int position = 0;
		s.close();
		System.out.printf("\tMon\tTue\tWed\tThu\tFri\tSat\tSan\n");
		
		for(int i=1;i<day;i++) {
			System.out.printf("\t");
			position++;
		}
		
		while(count<=date) {
			System.out.printf("\t%d",count);
			count++;
			position++;
			if(position%7==0) {
				System.out.printf("\n",count);				
			}
		}
	}
}
