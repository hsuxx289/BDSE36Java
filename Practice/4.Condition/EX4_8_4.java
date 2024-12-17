package com.bo.java;

public class EX4_8_4 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.println("== 歡迎使用 BMI 評估系統(18-24) ==");
		System.out.printf("請輸入客戶身高(公分) ");
		double height = s.getDouble()/100;
		System.out.printf("請輸入客戶體重(公斤) ");
		int weight = s.getInt();
		s.close();
		double bmi = weight/(height*height);
		double fee = 0;
		if (bmi >= 35) {
			fee = (bmi - 23)/0.5;
			System.out.printf("您第三度肥胖(病態肥胖), 需要花費%.2f 萬元達成標準身材",fee);
		}
		else if (bmi >= 30 && bmi < 35) {
			fee = (bmi - 23)/0.5;
			System.out.printf("您第二度肥胖(重度增加), 需要花費%.2f 萬元達成標準身材",fee);
		}
		else if (bmi >= 25 && bmi < 30) {
			fee = (bmi - 23)/0.5;
			System.out.printf("您第一度肥胖(中度增加), 需要花費%.2f 萬元達成標準身材",fee);
		}
		else if (bmi >= 23 && bmi < 25) {
			fee = (bmi - 23)/0.5;
			System.out.printf("您過重(輕度增加), 需要花費%.2f 萬元達成標準身材",fee);
		}
		else if (bmi <23 && bmi >= 18.5)
			System.out.println("恭喜您有一個健美體材");
		else if (bmi <18.5) {
			System.out.printf("您身材太瘦了");
		}

	}

}
