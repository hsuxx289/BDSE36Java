package com.bo.java;
public class Verifier {

	public static void main(String[] args) {
		// (1)	產生四個數字的驗證碼。
		int[] a = new int[4];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*10);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
		// (2)	產生四個數字的驗證碼且不重覆。
		int[] n = {0,1,2,3,4,5,6,7,8,9};
		int[] b = new int[4];
		int rand = -1;
		for(int i=0;i<b.length;i++) {
			rand = (int)(Math.random()*(10-i));
			b[i]= n[rand];
			for (int j=rand;j<n.length-1;j++) {
				n[j]=n[j+1];
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
	
		// (3)	產生六個包含英文字母和數字的驗證碼。


	}

}
