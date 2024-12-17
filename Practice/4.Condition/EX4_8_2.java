package com.bo.java;


public class EX4_8_2 {

	public static void main(String[] args) {
		Input s = new Input();
		System.out.printf("請輸入性別(男/女)=> ");
		String sex = s.getString();
		System.out.printf("請輸入身高(cm)=> ");
		int height = s.getInt();
		System.out.printf("請輸入體重(kg)=> ");
		int weight = s.getInt();
		s.close();
		
		if(sex.equals("男")){
			int standard = (int)((height-80)*0.7);
			if(standard == weight) {
				System.out.println("您的體重符合標準!!");
			}
			else if (standard < weight) {
				System.out.printf("您過重 應該減肥 %d公斤",weight-standard);
			}
			else {
				System.out.printf("您過重 應該增重 %d公斤",standard-standard);
			}
		}
		else if(sex.equals("女")){
			int standard = (int)((height-70)*0.6);
			if(standard == weight) {
				System.out.println("您的體重符合標準!!");
			}
			else if (standard < weight) {
				System.out.printf("您過重 應該減肥 %d公斤",weight-standard);
			}
			else {
				System.out.printf("您過重 應該增重 %d公斤",standard-standard);
			}
		}
		
	}

}
