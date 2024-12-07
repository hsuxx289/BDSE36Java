package com.bo.java;

public class Rabbit {

	public static void main(String[] args) {
		// 一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。
		boolean rabbit=true;
		int count=0;
		while (rabbit) {
			count++;
			if (count%3==1 && count%5==3 && count%7==2)
				rabbit = false;
		}
		System.out.println(count);
	}

}
