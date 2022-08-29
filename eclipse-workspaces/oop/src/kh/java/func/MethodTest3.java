package kh.java.func;

import java.util.Scanner;

public class MethodTest3 {
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		add(num1,num2,num3);
		add(num1,num2);
		
		
	}
	
	public int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
		
	}
	
	public int add(int num1, int num2, int num3) {
		int sum2 = num1+num2+num3;
		return sum2;
		
	}
}
