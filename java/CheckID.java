package com.bo.java;
import java.util.Scanner;
public class CheckID {

	
	static boolean isID(String id) {
		char[] idString = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] idNumber = {'0','1','2','3','4','5','6','7','8','9'};
		boolean isID = true;
		id.toUpperCase();
		//字數判斷
		if(id.length()!=10) {
		isID = false;
		}
		//各字元轉字元陣列儲存
		char[] useridc= new char[10];
		for(int i=0;i<id.length();i++) {
			useridc[i]=id.charAt(i);
		}
		//生成數字陣列 初始值負一
		int[] useridn= new int[10];
		for (int i=0;i<useridn.length;i++) {
			useridn[i] = -1;
		}
		//判斷第一個英文字為第幾個英文字母
		for(int i=0;i<idString.length;i++) {
			if (useridc[0] == idString[i])
				useridn[0] = i;
		}
		//字元轉數字
		for(int i=1;i<useridc.length;i++) {
			for(int j=0;j<idNumber.length;j++) {
				if(useridc[i]==idNumber[j]) {
					useridn[i]=j;
				}
			}
		}
		//判斷第一位是否為英文字母
		if (useridn[0] == -1) {
			isID = false;
		}
		//判斷第二位是否為1或2
		if(useridn[1] !=1 && useridn[1] !=2) {
		isID = false;
		}
		//判斷第三到十位是否為數字
		for(int i=0;i<useridn.length;i++) {
			if (useridn[0] == -1) {
				isID = false;
			}
		
		}
		//驗證碼規則
		int initial = useridn[0] + 1;
		switch(initial){
			case 2,14,26:useridn[0]=0;
				 break;
			case 1,13,23:useridn[0]=1;
			 	 break;
			case 11,12,25:useridn[0]=2;
			 	 break;
			case 10,22,24:useridn[0]=3;
			 	 break;
			case 8,21:useridn[0]=4;
			 	 break;
			case 7,20:useridn[0]=5;
			 	 break;
			case 6,19:useridn[0]=6;
			 	 break;
			case 5,18:useridn[0]=7;
			 	 break;
			case 4,17,15:useridn[0]=8;
			 	 break;
			case 3,9,16:useridn[0]=9;
			 	 break;
		}
		int sum = 0;
		for(int i=1;i<useridn.length-1;i++) {
			sum += useridn[i]*(9-i);
		}
		sum += useridn[0]+useridn[9];
		
		if (sum%10 !=0) {
			isID = false;
		}
		
		/* 檢查陣列元素
			for(int i=0;i<useridn.length;i++) {
			System.out.print(useridn[i]);
		}
		*/
		
		return isID;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a ID");
		String id = scanner.next();
		scanner.close();
		
		boolean result = isID(id);
		if(result) 
			System.out.println("Correct ID!");
		else
			System.out.println("Wrong ID!");
	}

}
