package com.bo.java;

public class EX4_8_1 {

	public static void main(String[] args) {
		Input s = new Input();
		int gasFee = 100;
		System.out.printf("請輸入使用度數=>"); 
		int gas = s.getInt();
		if (gas<=20) {
			System.out.printf("應繳費用為 => %d 元",gasFee);
		}
		else {
			gas -= 20;
			gasFee += (gas) * 5;
			System.out.printf("應繳費用為 => %d 元",gasFee);
		}
		s.close();
	}

}
