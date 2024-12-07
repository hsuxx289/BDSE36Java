package com.bo.employee.java;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emps = new Employee[4];
		emps[0] = new TempEmployee("AAA","M","0221","0988","123",240,100);
		emps[1] = new PermEmployee("BBB","M","0222","0987","312",30000);
		emps[2] = new Mgmt("CCC","F","0301","0986","312",30000,1);
		emps[3] = new Sales("DDD","M","0312","0989","312",30000,2);
		
		for(int i=0;i<emps.length;i++) {
			emps[i].printData();
			emps[i].printSalary();
		}
		
	}

}
