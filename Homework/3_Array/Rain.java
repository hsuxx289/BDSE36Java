package com.bo.java;

import java.util.Scanner;

public class Rain {
//	輸入一字串，字串為”all” 表示計算60個月的總平均降雨量，
//	”year”、”season”和”month”分別表示計算某年、某季或某月的平均降雨量。
//	若為後三者，再輸入一個正整數表示那一年、那一季或那一月。
//	說明：5年12個月的降雨量以三維陣列形式事先給好60個浮點數
//	需做誤錯處理：
//	a.	輸入除了”all”、”year”、”season”和”month”以外的字串
//	b.	若輸入”year”，而正整數輸入1至5以外的數字
//	c.	若輸入”season”，而正整數輸入1至4以外的數字
//	d.	若輸入”month”，而正整數輸入1至12以外的數字


	public static void main(String[] args) {
		double[][][] rain = new double[][][]{{{1,1,1},{2,2,2},{3,3,3},{4,4,4}},
			{{2,2,2},{2,2,2},{3,3,3},{4,4,4}},{{3,3,3},{2,2,2},{3,3,3},{4,4,4}},
			{{4,4,4},{2,2,2},{3,3,3},{4,4,4}},{{5,5,5},{2,2,2},{3,3,3},{4,4,4}}};	
		double sum=0;
		int num=0;
		int mod=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the interval of the average rain.(all,year,season,month)");
		String input = scanner.next();
	
		
		switch(input) {
		case "all":
			for(double[][] m:rain)
				for(double[] n:m)
					for(double o:n)
						sum += o;
			System.out.println("The average rain of all is: " + sum/60);
		case "year":
			System.out.println("Please input a year");
			num = scanner.nextInt();
			if (num<1 || num>5) {
				System.out.println("Wrong interval!");
				break;
			}
			for(int i=0;i<rain[num-1].length;i++)
				for (int j=0;j<rain[num-1][i].length;j++) {
					sum += rain[num-1][i][j];
				}
			System.out.println("The average rain of the year is: " + sum/12);
			break;
		case "season":
			System.out.println("Please input a season");
			num = scanner.nextInt();
			if (num<1 || num>4) {
				System.out.println("Wrong interval!");
				break;
			}
			for(int i=0;i<rain.length;i++)
				for (int j=0;j<rain[0][0].length;j++) {
					sum += rain[i][num-1][j];
				}
			System.out.println("The average rain of the season is: " + sum/15);
			break;
		case "month":
			System.out.println("Please input a month");
			num = scanner.nextInt();
			if (num<1 || num>12) {
				System.out.println("Wrong interval!");
				break;
			}
			
			mod = (num-1)%12;
			num = (num-1)/3;
			for(int i=0;i<rain.length;i++)
				{
					sum += rain[i][num][mod];
				}
			System.out.println("The average rain of the month is: " + sum/5);
			break;
		default:
			System.out.println("Wrong interval!");
		scanner.close();
		}
		
	
	}

}
