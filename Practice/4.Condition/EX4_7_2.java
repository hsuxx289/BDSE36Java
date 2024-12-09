package com.bo.java;

public class EX4_7_2 {

	public static void main(String[] args) {
		
		double oper1, oper2, result;
		String operator_str;
		char operator;
		
		Input s = new Input();
		
		System.out.println("== 歡迎使用 +、*、/ 計算器 ==");
		
		System.out.printf("請輸入(如: 45 + 28) =>");
		oper1 = s.getDouble();
		operator_str = s.getString();
		operator = operator_str.charAt(0);
		oper2 = s.getDouble();
		result = 0;
		s.close();
		switch(operator) {
			case '+':
				result = oper1 + oper2;
				break;
			case '-':
				result = oper1 - oper2;
				break;
			case '*':
				result = oper1 * oper2;
				break;
			case '/':
				result = oper1 / oper2;
				break;
			default:
				System.out.println("錯誤輸入");
		}
		System.out.printf("%.2f %s %.2f = %.2f\n",oper1,operator,oper2,result);
	}

}
