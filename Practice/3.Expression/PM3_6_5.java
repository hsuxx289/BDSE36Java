package com.bo.ex;

import java.util.Scanner;

public class PM3_6_5 {


	public static void main(String[] args) {
		int sum = 0;
		int wsum = 0;
		int weight = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("***** 憂鬱症自我診斷系統 *****");
		System.out.println("請依序回答下列問題, 相似度 (0 ~ 10)");
		System.out.println("不明顯(0), 稍明顯(2), 明顯(6), 很明顯(10)\n");
		System.out.printf("(1) 想哭（比重 5）");
		int q1 = s.nextInt();
		System.out.printf("(2) 心情不好（比重 4）");
		int q2 = s.nextInt();
		System.out.printf("(3) 以前更容易發脾氣（比重 5）");
		int q3 = s.nextInt();
		System.out.printf("(4) 我睡不好（比重 3）");
		int q4 = s.nextInt();
		System.out.printf("(5) 我覺得不想吃東西（比重 2）");
		int q5 = s.nextInt();
		System.out.printf("(6) 我覺得想事情或做事情比以前慢（比重 3) ");
		int q6 = s.nextInt();
		System.out.printf("(7) 我比較會往壞的方向想（比重 4）");
		int q7 = s.nextInt();
		System.out.printf("(8) 我覺得身體不舒服（比重 2）");
		int q8 = s.nextInt();
		System.out.printf("(9) 我覺得自己很沒用（比重 3）");
		int q9 = s.nextInt();
		System.out.printf("(10) 我很想不開、甚至想死（比重 5）");
		int q10 = s.nextInt();
		s.close();
		sum = q1+q2+q3+q4+q5+q6+q7+q8+q9+q10;
		weight = 5+4+5+3+2+3+4+2+3+5;
		wsum = q1*5+q2*4+q3*5+q4*3+q5*2+q6*3+q7*4+q8*2+q9*3+q10*5;
		System.out.printf("\n總合計算 (0 ~ 100), 判斷結果: 正常（0 ~ 30）\n");
		System.out.printf("\t輕微憂鬱症（30 ~ 60), 明顯憂鬱症（60~100）\n");
		System.out.printf("您憂鬱症指數為 =>%d\n", sum);
		System.out.printf("請輸入華式溫度 =>");
		System.out.printf("\n加權指數計算 (0 ~ 10), 判斷結果: 正常（0 ~ 3）\n");
		System.out.printf("\t輕微憂鬱症（3 ~ 6）, 明顯憂鬱症（6~10）\n");
		System.out.printf("您憂鬱症指數為 =>%.2f\n", (float)wsum/weight);
		
	}

}
