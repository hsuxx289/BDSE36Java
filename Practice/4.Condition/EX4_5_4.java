package com.bo.java;

public class EX4_5_4 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入第一個玩家的姓名(開始擲骰子) => ");
		String player1 = s.getString();
		int num1 = s.randInt(6);
		int num2 = s.randInt(6);
		int num3 = s.randInt(6);
		int sum1 = num1 + num2 + num3;
		System.out.printf("%s 先生/小姐擲骰子是 %d %d %d 合計 = %d\n",player1,num1,num2,num3,sum1);
		
		System.out.printf("請輸入第二個玩家的姓名(開始擲骰子) => ");
		String player2 = s.getString();
		num1 = s.randInt(6);
		num2 = s.randInt(6);
		num3 = s.randInt(6);
		int sum2 = num1 + num2 + num3;
		System.out.printf("%s 先生/小姐擲骰子是 %d %d %d 合計 = %d\n",player2,num1,num2,num3,sum2);
		s.close();
		if (sum1 == sum2)
			System.out.println("兩位平手");
		if (sum1 > sum2)
			System.out.printf("恭喜 %s 先生/小姐贏了此局",player1);
		if (sum1 < sum2)
			System.out.printf("恭喜 %s 先生/小姐贏了此局",player2);
	}

}
