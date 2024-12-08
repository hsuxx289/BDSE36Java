package com.bo.java;
public class EX4_1 {

	public static void main(String[] args) {
		Input s = new Input(); 
		System.out.printf("百事可樂(每瓶15元) 購買數量=>");
		int pepsi = s.getInt();
		int pepsiSum = pepsi * 15;
		
		System.out.printf("國民便當(每盒45元) 購買數量=>");
		int banto = s.getInt();
		int bantoSum = banto * 45;
	
		System.out.printf("約翰走路(每瓶312元) 購買數量=>");
		int jW = s.getInt();
		int jWSum = jW * 312;
		int total = pepsiSum + bantoSum + jWSum;
		s.close();
		System.out.println("*** 列印購物清單 ***");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("|品名\t|單價\t|數量\t|小計\t|");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("|百事可樂\t|15\t|%d\t|%d\t|\n",pepsi,pepsiSum);
		System.out.printf("|國民便當\t|45\t|%d\t|%d\t|\n",banto,bantoSum);
		System.out.printf("|約翰走路\t|312\t|%d\t|%d\t|\n",jW,jWSum);
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("|總計\t|%d\t\t|\n",total);
		System.out.println("-------------------------------------------------------------------");

	}
	

}
