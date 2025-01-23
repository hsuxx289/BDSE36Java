package com.bo.java;

import java.util.Scanner;

public class PM4_6_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String key;
		System.out.println("歡迎使用醫療診斷系統,  請依序回答問題");
		System.out.println("=====================================");
		System.out.printf("請問您最近是否發燒 (y/n) =>");
		key = s.next();
		if(key.equals("y")) {
			System.out.printf("請問您最近是否咳嗽 (y/n) =>");
			key = s.next();
			if(key.equals("y")) {
				System.out.printf("請問您最近是否感到疲倦 (y/n) =>");
				key = s.next();
				if(key.equals("y")) {
					System.out.println("先生/小姐您已經感冒了 !!!");
				}
				else {
					System.out.println("需要由其他系統進一步檢查 !!!");	
				}
			}
			else {		
				System.out.printf("請問您是否有高血壓 (y/n) =>");
				key = s.next();
				if(key.equals("y")) {
					System.out.printf("請問您是否常常口乾 (y/n) =>");
					key = s.next();
					if(key.equals("y")) {
						System.out.println("先生/小姐您可能得肝病了 !!!");
					}
					else {
						System.out.println("需要由其他系統進一步檢查 !!!");
					}
				}
				else {
					System.out.printf("請問您常常盜汗 (y/n) =>");
					key = s.next();
					if(key.equals("y")) {
						System.out.println("先生/小姐您可能得肺病了 !!!");
					}
					else {
						System.out.println("需要由其他系統進一步檢查 !!!");
					}
				}
			}
			
		}
		else {
			System.out.println("應該是健康身體");			
		}
		
		s.close();

	}

}
