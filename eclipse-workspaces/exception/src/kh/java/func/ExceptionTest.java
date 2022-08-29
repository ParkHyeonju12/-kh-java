package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner sc = new Scanner(System.in);
	
	public void exceptionTest1() {
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int num = 0;
			try {
				num = sc.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("에러발생!!");
			}
			System.out.println("결과 : " + num);
			if(num == 0) {
				break;
			}
		} 
		System.out.println("반복문 끝!");
	}
	
	public void test2() {
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		while(true) {
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}else {
			System.out.println("결과 : "+(num1/num2));
			break;
		}
		}
//		try {
//			System.out.println("결과 : "+(num1/num2));
//		}catch(ArithmeticException e) {
//			System.out.println("0으로는 나눌 수 없습니다");
//		}
	}
	
	public void test3() {
		try {
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("결과 : "+(num1/num2));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		catch(InputMismatchException e) {
			System.out.println("정수를 입력해주세요");
		}
	}
	
	public void test4() {
		try {
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("결과 : "+(num1/num2));
		}
		catch(Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}
	
	public void test5() {
		try {
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		}finally {
			System.out.println("finally");
		}
	}
	
	public void test6() {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test7() throws FileNotFoundException  {
		FileInputStream fis = new FileInputStream("test.txt");
	}
	
	public void test8() {
		test7();
	}
}
