package com.bo.java;

import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		/* 出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
		若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
		若輸入不正確，再次出現”請輸入密碼”的提示。
		若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。 */
		int real = 0;
		int i = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter one digit password.");
		int password = scanner.nextInt();
		
		do {
			if (i<3 && real!=password) {
				System.out.println("Wrong password.");
				System.out.println("Please enter another one digit password.");
				password = scanner.nextInt();
			}
			else if (real == password) {
				System.out.println("Correct password. Welcome!");
				break;
			}
			i++;
		}
		while (i<3);
		scanner.close();
		if (i==3)
			System.out.println("Entered password more than three times!");
	}

}
