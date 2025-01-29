package com.bo.java;

public class PM6_5_4 {
	
	public static void main(String[] args) {
		Input s = new Input();
		String name,key;
		int hash;
		String passwd1, passwd2;
		int value1, value2;
		System.out.printf("== 帳號/密碼設定程式 ==\n");
		System.out.printf("請輸入使用者名稱 => ");
		name = s.getString();
		
		System.out.printf("請輸入密碼明文 => ");
		passwd1 = s.getString();
		value1 = 1 + (int)(Math.random()*999);
		key = String.valueOf(value1);
		System.out.printf("產生鹽亂數 = %s 儲存於電腦系統內\n",key);
		passwd2 = passwd1.concat(key);
		System.out.printf("密碼明文與鹽組合 = %s\n", passwd2);
		hash = passwd2.hashCode();
		System.out.printf("%s 密碼雜湊 = %d\n", name, hash);
		
		System.out.printf("\n== 密碼驗證程式 ==\n");
		System.out.printf("請輸入密碼 (驗證密碼是否正確) => ");
		passwd1 = s.getString();
		System.out.printf("由系統中取出鹽 = %s \n",key);
		passwd2 = passwd1.concat(key);
		System.out.printf("輸入密碼與鹽組合 = %s\n", passwd2);
		value2 = passwd2.hashCode();
		System.out.printf("輸入密碼雜湊值 = %d\n", value2);
	
		if(value2 == hash) {
			System.out.printf("%s 密碼設定正確，該帳戶可使用",name);
		}
		else {
			System.out.printf("%s 密碼設定不正確，請重新設定",name);			
		}
	
	
	}
	
}

