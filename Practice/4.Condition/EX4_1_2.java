package com.bo.java;

public class EX4_1_2 {

	public static void main(String[] args) {
		Input s = new Input(); 
		System.out.printf("請輸入客戶姓名 =>");
		String name = s.getString();
		System.out.printf("請輸入客戶性別(男: 1, 女: 0) =>");
		int sex = s.getInt();
		System.out.printf("請輸入客戶年齡 =>");
		int age = s.getInt();
		System.out.printf("請輸入客戶地址 =>");
		String addr = s.getString();
		System.out.printf("請輸入客戶身高 =>");
		int height = s.getInt();
		System.out.printf("請輸入客戶體重 =>");
		int weight = s.getInt();
		s.close();
		System.out.println("\n列印客戶資料如下:");
		System.out.printf("客戶姓名 = %s\n",name);
		if (sex==1)
			System.out.printf("   性別 = 男\n");
		else
			System.out.printf("   性別 = 女\n");
		System.out.printf("   年齡 = %d\n",age);
		System.out.printf("   地址 = %s\n",addr);
		System.out.printf("   身高 = %d\n",height);
		System.out.printf("   體重 = %d\n",weight);
	}

}
