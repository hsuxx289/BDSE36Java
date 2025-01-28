package com.bo.java;
import java.util.*;
public class Input {

	Scanner s = new Scanner(System.in);
	
	public int getInt() {
		
		int x  = s.nextInt();
		return x;
	}
	
	public String getString() {
		String x  = s.next();
		return x;
	}
	public double getDouble() {
		double x  = s.nextDouble();
		return x;
	}
	
	public String getNextLine() {
		String x = s.nextLine();
		return x;
	}
	
	public void close() {
		s.close();
	}
	
	public int randInt(int x) {
		Random r = new Random();
		int y = 1 + r.nextInt(x);
		return y;
	}
	
}
