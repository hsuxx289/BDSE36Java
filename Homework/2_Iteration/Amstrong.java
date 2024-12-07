package com.bo.java;

public class Amstrong {

	public static void main(String[] args) {
		/*Amstrong數是指一個三位數的整數，其各位數之立方和等於該數本身。
			找出所有的Amstrong數。
			說明：153=13+53+33，故153為Amstrong數。*/
		for (int i=1;i<10;i++) {
			for (int j=0;j<10;j++) {
				for (int k=0;k<10;k++) {
					if (i*i*i+j*j*j+k*k*k==i*100+j*10+k)
						System.out.print(i*100+j*10+k+" ");
				}
			}
		}


	}

}
