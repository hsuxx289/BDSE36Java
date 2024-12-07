package com.bo.java;
import java.util.Scanner;
public class Season {

	public static void main(String[] args) {
		//輸入月份1~12月，利用switch判斷相對應的季節春、夏、秋、冬並印出。若不在此範圍則印出”輸入錯誤”。
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a month.");
		int season = scanner.nextInt();
		scanner.close();
		
		switch(season) {
		 case 1,2,3:
			System.out.println("It is Spring");
		 	break;
		 case 4,5,6:
			System.out.println("It is Summer");
		 	break;
		 case 7,8,9:
			System.out.println("It is Fall");
		 	break;
		 case 10,11,12:
			System.out.println("It is Winter");
		 	break;
		 default:
			 System.out.println("It is not a month.");
	}
	}
}
