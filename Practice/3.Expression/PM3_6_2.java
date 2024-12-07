package com.bo.ex;

import java.util.Scanner;

public class PM3_6_2 {


	public static void main(String[] args) {
		int time,hour,min,sec;
		double rate,cost;
		Scanner s = new Scanner(System.in);
		System.out.printf("請輸入通話時間(時 分 秒) =>");
		hour = s.nextInt();
		min = s.nextInt();
		sec = s.nextInt();
		time = (hour * 60 + min) * 60 + sec;
		System.out.printf("通話時間總共 %d 秒\n",time);
		System.out.printf("請輸入每秒計費(如 0.5) =>");
		rate = s.nextDouble();
		s.close();
		cost = time * rate;
		System.out.printf("通話費總共 %d 元",(int)cost);
		
	}

}
