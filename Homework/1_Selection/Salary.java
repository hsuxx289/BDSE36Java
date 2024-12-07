package com.bo.java;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// 輸入便利商店工讀生的工作時數，並計算其薪資。
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input working hour.");
		double hour = scanner.nextDouble();
		scanner.close();
		double sumSalary = 0;
		/*60小時以內，時薪150元。
		61~80小時，以時薪1.25倍計算。
		81小時以上，以時薪1.5倍計算。*/
		double hourlySalaryUnder60 = 150;
		double hourlySalaryBetween60_80 = 150 * 1.25;
		double hourlySalaryAbove80 = 150 * 1.5;

		//說明：薪資以累計方式計算。若工時為90小時，則薪資為60*150 + 20*150*1.25 + 10*150*1.5元。
		
		
		
		if (hour > 80) {
			sumSalary = 60 * hourlySalaryUnder60 + (80-60)* hourlySalaryBetween60_80 + (hour-80) * hourlySalaryAbove80;
			System.out.println(sumSalary);
			
		}	
		else if (hour > 60) {
			sumSalary = 60 * hourlySalaryUnder60 + (hour - 60)* hourlySalaryBetween60_80;
			System.out.println(sumSalary);
			}
		
		else {
			sumSalary = hour * hourlySalaryUnder60;
			System.out.println(sumSalary);
		}

	}

}
