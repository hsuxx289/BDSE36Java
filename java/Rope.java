package com.bo.java;

public class Rope {

	public static void main(String[] args) {
		// 若有一條繩子長3000公尺，每天剪去一半的長度，需多少天繩子的長度會短於5公尺。
		int rope = 3000;
		int count = 0;
		while (rope>=5) {
			rope /= 2;
			count++;
		}
		System.out.print(count);
	}
}
