package com.bo.java;

public class EX4_2_3 {

	public static void main(String[] args) {
		Input s = new Input(); 
		int overtimec = 0;
		System.out.printf("請輸入員工姓名 =>");
		String name = s.getString();
		System.out.printf("請輸入底薪 =>");
		int base = s.getInt();
			if (base<16800) {
				base = 16800;
			}
		System.out.printf("請輸入加班時數 =>");
		int overtime = s.getInt();
			if (overtime>45) {
				overtime = 45;	
			}
			overtimec = (int)((double)(base/(30*8))*1.333*overtime);
		s.close();
		
		int salary = base + overtimec;
		
		System.out.println(" ");
		System.out.printf("員工姓名 = %s\n",name);
		System.out.printf("底薪 = %d\n",base);
		if (overtime!=0) {
		System.out.printf("加班時數 = %d\n",overtime);
		System.out.printf("加班費 = %d\n",overtimec);
		}
		System.out.printf("底薪 = %d\n",salary);

	}

}
