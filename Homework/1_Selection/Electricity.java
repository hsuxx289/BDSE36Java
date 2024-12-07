package com.bo.java;

import java.util.Scanner;

public class Electricity {

		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select electricity type. 0 = 營業; 1 = 非營業");
		int type = scanner.nextInt();
		System.out.println("Please enter electricity usage.");
		double usage = scanner.nextDouble();
		scanner.close();
		
		double[][] rate = {{1.63,2.1,2.89,3.94,4.6,5.03},{2.12,2.91,3.44,5.05}};
		double[][] usagegap = {{0,120,330,500,700,1000},{0,330,700,1500}};
		
		double sum = 0;
		int x = 0;
		

			x= rate[type].length;
			
					
			for(int i=1;i<x;i++) {
				if (usage > usagegap[type][i])
					sum += (usagegap[type][i] - usagegap[type][i-1]) * rate[type][i-1];
				else {
					sum += usage + (usage-usagegap[type][i-1]) * rate[type] [i-1];
					break;
				}
			}
			System.out.println(sum);
		
		
	}	
}
