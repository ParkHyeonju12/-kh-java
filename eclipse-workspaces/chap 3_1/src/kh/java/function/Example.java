package kh.java.function;

import java.util.Scanner;

public class Example {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 정수 입력 : ");
		int num = sc.nextInt();
		System.out.print("두번 째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("========== 결과 ==========");
		
		System.out.println("더하기 결과 : " + (num+num1));
		System.out.println("빼기 결과 : " + (num-num1));
		System.out.println("곱하기 결과 : " + (num*num1));
		System.out.println("나누기 몫 : " + (num/num1));
		System.out.println("나누기 나머지 : " + (num%num1));
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 입력 : ");
		double num = sc.nextDouble();
		System.out.print("세로 길이 입력 : ");
		double num1 = sc.nextDouble();
		
		System.out.println("========== 결과 ==========");
		
		System.out.println("면적 : " + (num*num1));
		System.out.println("둘레 : " + 2*(num+num1));
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어단어 입력 : ");
		String eng = sc.nextLine();
		System.out.println("첫번째 문자 : "+eng.charAt(0));
		System.out.println("두번째 문자 : "+eng.charAt(1));
		System.out.println("세번째 문자 : "+eng.charAt(2));
		
	}
}
