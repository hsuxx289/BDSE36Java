package com.bo.java;

public class EX4_6_4 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.println("歡迎使用醫療診斷系統,  請依序回答問題");
		System.out.println("=====================================");
		System.out.printf("請問您最近是否發燒 (y/n) => ");
		String a = s.getString();
		if (a=="y") {
			System.out.printf("請問您最近是否咳嗽 (y/n) => ");
			a = s.getString();
			if (a=="y") {
				System.out.println("請問您最近是否常疲倦 (y/n) => ");
				if (a=="y") {
					System.out.println("先生/小姐您可能感冒了");
				}
			
				else {
					System.out.println("請到別科門診 !!!");
				}
			}
			else {
				System.out.println("請問你是否有高血壓");
				a = s.getString();
				if (a=="y") {
					System.out.println("請問你是否常常口乾");
					a = s.getString();
					if (a=="Y") {
						System.out.println("先生/小姐您可能得了肝病");
					}
					else {
						System.out.println("請到別科門診 !!!");
					}
				}
			}
		}
		else {
			System.out.println("先生/小姐您有健康的身體 !!!");
		}	
		
	}

}
