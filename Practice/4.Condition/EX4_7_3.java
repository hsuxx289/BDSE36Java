package com.bo.java;

public class EX4_7_3 {

	public static void main(String[] args) {
		Input s = new Input();
		int num = -1;
		String chinese = "零";
		
		System.out.println("== 歡迎使用數字轉換國字系統 ==");
		
		System.out.printf("請輸入一個整數數字 => ");
		num = s.getInt();
		s.close();
		switch(num) {
			case 0:
			chinese = "零";
			break;
			case 1:
				chinese = "壹";
				break;
			case 2:
				chinese = "貳";
				break;
			case 3:
				chinese = "參";
				break;
			case 4:
				chinese = "肆";
				break;
			case 5:
				chinese = "伍";
				break;
			case 6:
				chinese = "陸";
				break;
			case 7:
				chinese = "柒";
				break;
			case 8:
				chinese = "捌";
				break;
			case 9:
				chinese = "玖";
				break;
			default:
				System.out.println("錯誤輸入");
		}
		System.out.printf("%d <==> %s",num,chinese);
	}


}
