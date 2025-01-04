package com.bo.java;

public class EX4_8_9 {

	public static void main(String[] args) {
		int baseSalary = 16500;
		int incentive =0;
		Input s = new Input();
		System.out.printf("請輸入業務員姓名=> ");
		String name = s.getString();
		System.out.printf("請輸入業務員銷售金額(萬元)=> ");
		double sales = s.getDouble();
		
		if (sales>10) {
			
			incentive = 5000 + (int)(Math.ceil((sales-10)/5)*5000);
		}
		
		
		
		System.out.println("列印員工薪資如下");
		System.out.println("員工姓名 = " + name);
		System.out.println("底薪 = "+ baseSalary);
		System.out.println("獎金 = " + incentive);
		System.out.println("本月薪資 = "+ (baseSalary + incentive));

	}

}
