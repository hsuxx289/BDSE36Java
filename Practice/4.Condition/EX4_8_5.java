package com.bo.java;

public class EX4_8_5 {

	public static void main(String[] args) {
		
		Input s = new Input();
		
		System.out.printf("請輸入該月工作時數 => ");
		int hour = s.getInt();
		s.close();
		
		int salary=0,overtime=0,uncountHour=0;
		
		if(hour<=160) {
			salary = hour * 105;
		}
		else if (hour<=205) {
			salary = 160 * 105;
			overtime = (int)((hour-160) * 105 * 1.5);
		}
		else if (hour>205) {
			salary = 160 * 105;
			overtime = (int)((205-160) * 105 * 1.5);
			uncountHour = hour - 205;
		}
		
		
		System.out.println("本月基本薪資如下：");
		System.out.println("基本薪資 = " + salary);
		System.out.println("加班費 = " + overtime);
		System.out.println("總共薪資 = " + (salary+overtime));
		System.out.println("不計費時間 = " + uncountHour);
		
		
		
		
	}

}
