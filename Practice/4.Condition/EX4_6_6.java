package com.bo.java;

public class EX4_6_5 {

	public static void main(String[] args) {
		
		Input s = new Input();
		int count = 0;
		String y = "y";
		
		System.out.println("歡迎使用肺結核自我診斷系統, 請回答下列問題");
		System.out.println("=====================================");		
		System.out.println("=== 感染期現象詢問 ===");
		System.out.printf("請問您最近是否有咳嗽 (y/n) => ");
		String keyin = s.getString();
		if (keyin.equals(y)){
			count += 1;
		}
		System.out.printf("請問您最近是否有咳痰 (y/n) => ");
		keyin = s.getString();
		if (keyin.equals(y)){
			count += 1;
		}
		System.out.printf("請問您最近是否常常疲倦 (y/n) => ");
		keyin = s.getString();
		if (keyin.equals(y)){
			count += 1;
		}
		System.out.printf("請問您最近是否體重有減輕 (y/n) => ");
		keyin = s.getString();
		if (keyin.equals(y)){
			count += 1;
		}
		
		if (count<3) {
			System.out.println("先生/小姐您未受到感染");
		}
		else {
			count = 0;
			System.out.println("");
			System.out.println("=== 發作期現象詢問 ===");
			
			System.out.printf("請問您最近是否胸悶 (y/n) => ");
			keyin = s.getString();
			if (keyin.equals(y)){
				count += 1;
			}
			System.out.printf("請問您最近是否胸痛 (y/n) => ");
			keyin = s.getString();
			if (keyin.equals(y)){
				count += 1;
			}
			System.out.printf("請問您最近是否呼吸困難 (y/n) => ");
			keyin = s.getString();
			if (keyin.equals(y)){
				count += 1;
			}
			
			if (count<2) {
				System.out.println("先生/小姐您僅受感染未發病, 儘快就醫");
			}
			
			else {
				count = 0;
				System.out.println("");
				System.out.println("=== 危險期現象詢問 ===");
				
				System.out.printf("請問您最近是否午後發燒 (y/n) => ");
				keyin = s.getString();
				if (keyin.equals(y)){
					count += 1;
				}
				System.out.printf("請問您最近是否胸痛 (y/n) => ");
				keyin = s.getString();
				if (keyin.equals(y)){
					count += 1;
				}
				System.out.printf("請問您最近是否呼吸困難 (y/n) => ");
				keyin = s.getString();
				if (keyin.equals(y)){
					count += 1;
				}
				
				if (count<2) {
					System.out.println("您已進入發作期, 請儘快就醫");
				}
				
				else
				{
					System.out.println("您已進入危險期, 必須隔離並儘快就醫");
				}
				s.close();
			}
			
		}
		
		
	}

}
