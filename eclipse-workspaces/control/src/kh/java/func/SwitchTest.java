package kh.java.func;

import java.util.Scanner;

public class SwitchTest {

	Scanner sc = new Scanner(System.in);

	public void test1() {

		System.out.print("1~3 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
//		
//		if(num == 1) {
//			System.out.println("11111111");
//		}else if(num == 2) {
//			System.out.println("22222222");
//		}else if(num == 3) {
//			System.out.println("33333333");
//		}else {
//			System.out.println("????????");
//		}

		switch (num) {
		case 1:
			System.out.println("11111111");
			break;
		case 2:
			System.out.println("22222222");
			break;
		case 3:
			System.out.println("33333333");
			break;
		default:
			System.out.println("????????");
			break;
		}
	}

	public void test2() {
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		switch (str) {
		case "aa":
			System.out.println("aaaaaaa");
			break;
		case "bb":
			System.out.println("bbbbbbb");
			break;
		default:
			System.out.println("정확히 입력하거라");
			break;
		}
	}

	public void test3() {
		System.out.print("일수를 알고싶은 달을 입력하세요 : ");
		int num = sc.nextInt();
		// 2월 - 28일 / 1월 3월 5월 7월 8월 10월 12월 - 31일/ 4월 6월 9월 11월 - 30일
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(num + "월달은 31일까지 있습니다.");
			break;

		case 2:
			System.out.println(num +"월달은 28일까지 있습니다.");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(num + "월달은 30일까지 있습니다.");
			break;
		}
	}

	public void test4() {
		System.out.println("장학금 지불 시스템입니다");
		System.out.print("학점을 입력하세요(A,B,C,D,F) : ");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'A':
			System.out.println("수고하셨습니다. 장학금을 100%지급해드리겠습니다.");
			break;

		case 'B':
			System.out.println("아쉽군요. 장학금을 50%지급해드리겠습니다.");
			break;

		case 'C':
			System.out.println("장학금을 바라시면 좀더 열심히 해주세요.");
			break;

		case 'D':
			System.out.println("크흠.......");
			break;

		default:
			System.out.println("학사경고입니다!!!!");
			break;
		}
	}

	public void test5() {
		System.out.println("======== 계산기 프로그램 ========");
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		String str = sc.next();

		System.out.print("첫번째 정수를 입력하세요 : ");
		int num = sc.nextInt();

		System.out.print("두번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();

		switch (str) {
		case "+":
			System.out.printf("%d+%d=%d", num, num1, num + num1);
			break;

		case "-":
			System.out.printf("%d-%d=%d", num, num1, num - num1);
			break;

		case "*":
			System.out.printf("%d*%d=%d", num, num1, num * num1);
			break;

		case "/":
			System.out.printf("%d/%d=%.6f", num, num1, (double) num / num1);
			break;

		default:
			System.out.println("연산자를 정확히 입력하세요!");
			break;
		}
	}
	
}
