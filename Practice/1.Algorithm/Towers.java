package com.bo.ex;

public class Towers {
	public static void main(String[] args) {
		char a = 'A';
		char b = 'B';
		char c = 'C';
		int n =4;
		
		towers(n,a,c,b);
		

	}
	public static void towers (int n, char s, char d, char a) {
		if (n>0) {
			towers(n-1,s,a,d);
			System.out.println("Move disk "+ n +" from "+ s +" to "+d);
			towers(n-1,a,d,s);
		}
	}
}
