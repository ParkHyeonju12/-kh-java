package kh.java.func;

import java.util.Scanner;

public class MethodTest {
	public void test6() {
		int num = 100;
		System.out.println("num : " + num); // 100
		test7(num); // 매개변수로 기본형 데이터를 전송 시 값을 '복사'한 전송
		System.out.println("num : " + num);
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//참조형데이터를 매개변수로 전달하면 
		//주소값이 전달 -- > 얕은복사
		test8(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(arr[2]);
		test9(arr[2]);
		System.out.println(arr[2]);
	}

	public void test7(int num) {
		num += 100;
		System.out.println("test7 : " + num); // 200
	}

	public void test8(int[] arr) {
		arr[2] = 100;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void test9() {
		int num = 300;
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		// 입력받은 두 수의 합을 출력 -> 메소드로 분리
		// 입력받은 두 수를 합쳐주는 메소드를 호출하고 결과를 받음
//		int sum = add(num1,num2);
//		System.out.println("입력받은 두 수의  합 : "+ sum);
		// 입력받은 두 수의 나눈기 결과를 받아오는 메소드 생성
		// 나누기 결과는 실수 타입으로 메소드 이름 -> div
		// 10 / 3 = 3.33
		double result = div(num1, num2);
		System.out.printf("입력받은 두 수의 나눗셈 결과 : %.2f", result);
	}

	public double div(int num1, int num2) {
		double div = num1 / (double) num2;
		return div;
	}

	public int add(int num1, int num2) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		int sum = num1 + num2;
		return sum;
	}

	public void test1() {
		System.out.println("test1 메소드 입니다.");
		test2();
		int num = test4();
		System.out.println(num);

	}

	private void test2() {
		System.out.println("test2 메소드 입니다.");
		return;
	}

	public int test4() {
		return 100;
	}
}
