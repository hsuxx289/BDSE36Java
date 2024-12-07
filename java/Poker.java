package com.bo.java;

public class Poker {

	public static void main(String[] args) {
		String[] n = new String[52];
		String[] g= {"黑桃","紅心","方塊","梅花"};
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				n[j+i*13]=(g[i]+(j+1));
			}
		}
		
		String[] a = new String[52];
		
		
		int rand = -1;
		for(int i=0;i<a.length;i++) {
			rand = (int)(Math.random()*(52-i));
			a[i]= n[rand];
			for (int j=rand;j<n.length-1;j++) {
				n[j]=n[j+1];
			}
		}
		for(int i=0;i<4;i++) {
			System.out.print("Player"+(i+1)+"\t");
			for(int j=0;j<13;j++) {
				System.out.print(a[j+i*13] +"\t");
			}
			System.out.println(" ");
		}
	}

}
