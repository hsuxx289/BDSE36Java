package com.bo.java;

public class PM5_3_3 {
	public static void main(String[] args) {
		System.out.println("歡迎光臨 == 春嬌柑仔店 ==");
		Input s = new Input();
		
		
		int sum = 0;
		System.out.printf("已購買 %d 請輸入產品價格 (0 結束) =>", sum);
		int n = s.getInt();
		while(n!=0) {
			sum += n;
			System.out.printf("已購買 %d 請輸入產品價格 (0 結束) =>", sum);
			n = s.getInt();
			
		}
		s.close();
		System.out.printf("人客您總共買 %d 元 謝謝!! 愛過來ㄜ",sum);
		
	}
}
