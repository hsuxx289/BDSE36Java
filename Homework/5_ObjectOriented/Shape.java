package com.bo.java;

//有一interface名為Shape，內有兩個成員方法：一為計算面積computeArea()，另為計算周長computeCircumference()。
//寫兩個類別分別為Circle和Rectangle，用以實作上述介面，並驗証結果。

public interface Shape {
	public static final double PI = 3.14159;
	public void computeArea();
	public void computeCircumference();
}
