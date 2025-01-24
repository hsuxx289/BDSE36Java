package com.bo.java;
import java.util.Random;
public class PM5_6_4 {
	public static void main(String[] args) {
		Random ran = new Random();
		Input s = new Input();
		boolean flag = true;
		int base = 1;
		int ran1,ran2;
		int value;
		
		for(int i=1;i<=5;i++) {
			base = base * 5;
			ran1 = ran.nextInt(base);
			ran2 = ran.nextInt(base);
			System.out.printf("第 %d 關輸入 %d + %d = ",i,ran1,ran2);
			value = s.getInt();
			if (value!=(ran1+ran2)) {
				System.out.printf("錯了!!答案是%d\n",ran1+ran2);
				System.out.printf("您已完成第%d關\n",i-1);				
				flag = false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("恭喜通過五關測試");
		}
		else {
			System.out.println("加油 !! 再來一次");
		}
	}
}
