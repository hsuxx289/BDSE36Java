package com.bo.java;

import java.util.Scanner;
import java.lang.Math;

public class PM3_5_2 {

	public static void main(String[] args) {
		
		int[] dice = new int[4];
		char[] dir = new char[] {'東','西','南','北'}; 
		int max;
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<dice.length;i++) {
			System.out.printf("請輸入%c方所擲數目(3~18)=>",dir[i]);
			dice[i] = s.nextInt();
		}
		s.close();
		
		max = Math.max(dice[0], Math.max(dice[1], Math.max(dice[2], dice[3])));
		
		
		System.out.printf("最大數 =>%d",max);
		
	}

}
