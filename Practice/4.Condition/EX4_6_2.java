package com.bo.java;

public class EX4_6_2 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.println("== 歡迎使用 BMI 評估系統(18-24) ==");
		System.out.printf("請輸入客戶身高(公分) ");
		double height = s.getDouble()/100;
		System.out.printf("請輸入客戶體重(公斤) ");
		int weight = s.getInt();
		double bmi = weight/(height*height);
		double weight2 = 0;
		System.out.printf("客戶 BMI 值 = %.2f\n",bmi);
		if (bmi >24) {
			weight2 = weight - 24*height*height;
			System.out.printf("您身材太胖了, 需要減重%.2f\n",weight2);
		}
		if (bmi <=24 && bmi >= 18)
			System.out.println("恭喜您有一個健美體材");
		if (bmi <18) {
			weight2 = 18*height*height - weight;
			System.out.printf("您身材太瘦了, 需要增胖%.2f\n",weight2);
		}
		System.out.println("== 系統結束, 歡迎再次光臨 ==");

	}

}
