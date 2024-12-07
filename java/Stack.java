package com.bo.java;


/*產生一個class名為Stack，有兩個成員變數分別為一int陣列(用以存放資料)和top(int) (用以標示目前最上層資料的註標值)；
 * 有兩個成員方法push()和pop()，分別用來放資料和取資料。
產生兩個exception class名為StackEmptyException和StackFullException，分別用來處理Stack空的和滿的狀況。
提示：Stack以先進後出(First In Last Out)的方式存取資料。*/

class StackFullException extends Exception{
	private static final long serialVersionUID = 1L;
	private int topx;
	public void settopx(int topx){this.topx = topx;}
	public int gettopx(){return this.topx;}
}

class StackEmptyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int topx;
	public void settopx(int topx){this.topx = topx;}
	public int gettopx(){return this.topx;}
}

public class Stack {
	static int[] a = new int[3];
	static int top = 0;
	
	

	public void push(int x) throws StackFullException {
			if (top<a.length) {
				top += 1;
				a[top-1] = x;
				System.out.println(top);
			}
			else {
				StackFullException e = new StackFullException();
				throw e;
			}
		
	}

	public void pop() throws StackEmptyException {
			if (top>0) {
				top -= 1;
				a[top] = 0;
				System.out.println(top);
			}
			else {
				StackEmptyException e = new StackEmptyException();
				throw e;
			}
			
	}
	
	
	public static void main(String[] args) {
		Stack s = new Stack();
		try{s.push(1);
		s.push(1);
		s.push(1);
		s.push(1);
		}
		catch(StackFullException e) {
			System.out.println("Stack is full!");
		}
		
		try{s.pop();
		s.pop();
		s.pop();
		s.pop();
		}
		catch(StackEmptyException e) {
			System.out.println("Stack is empty!");
		}
	}

}
