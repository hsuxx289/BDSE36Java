package com.bo.java;

public class PM6_5_3 {
	
	public static void main(String[] args) {
		Input s = new Input();
		double value = 0, ans = 0;
		int select = 0;
		display();
		select = s.getInt();
		
		while(select != 7) {
			System.out.printf("輸入一個數值 (注意三角函數範圍) => ");
			value = s.getDouble();
			switch(select) {
				case 1:
					ans = Math.log(value);
					System.out.printf("log(%.2f) = %.2f\n",value,ans);
					break;
				case 2:
					ans = Math.log10(value);
					System.out.printf("log(%.2f) = %.2f\n",value,ans);
					break;
				case 3:
					ans = Math.sqrt(value);
					System.out.printf("sqrt(%.2f) = %.2f\n",value,ans);
					break;
				case 4:
					ans = Math.sin(value);
					System.out.printf("sin(%.2f) = %.2f\n",value,ans);
					break;
				case 5:
					ans = Math.cos(value);
					System.out.printf("cos(%.2f) = %.2f\n",value,ans);
					break;
				case 6:
					ans = Math.tan(value);
					System.out.printf("tan(%.2f) = %.2f\n",value,ans);
					break;
				default:
					System.out.printf("輸入錯誤\n");
			}
			
			display();
			select = s.getInt();
			
		}
		System.out.println("== 謝謝使用 歡迎再度光臨 ==");
	}
	public static void display() {
		   System.out.printf("\n*** 工程計算器提供有下列功能 ***\n");

           System.out.printf("(1) log  函數\t (2) log10() 函數\n");

           System.out.printf("(3) sqrt 函數\t (4) sin()   函數\n");

           System.out.printf("(5) cos  函數\t (6) tan()   函數\n");

           System.out.printf("(7) 離開系統\n");

           System.out.printf("請選擇輸入 => ");
	}
}

