package kh.java.func;

import java.util.Scanner;

public class IfTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 10을 입력해보세요 : ");
		int num = sc.nextInt();
		
		if (num == 10) {
			System.out.println("숫자 10입니다.");
		} else {
			System.out.println("숫자 10이 아닙니다.");
		}

	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 숫자 구별 프로그램 ========");
		System.out.print("임의의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("당신이 입력한 수 " + num + "은(는) 양수입니다.");
		} else if (num == 0) {
			System.out.println("당신이 입력한 수 " + num + "은(는) 0입니다.");
		} else {
			System.out.println("당신이 입력한 수 " + num + "은(는) 음수입니다.");
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========두수 비교 프로그램========");
		System.out.print("첫번째 정수를 입력 하세요 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력 하세요 :");
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.println(num1 + "<" + num2);
			System.out.println("두번째 수가 더 큽니다.");
		} else if (num1 == num2) {
			System.out.println(num1 + "=" + num2);
			System.out.println("두 수가 같습니다");
		} else {
			System.out.println(num1 + ">" + num2);
			System.out.println("첫번째 수가 더 큽니다.");
		}
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========계산기 프로그램========");
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		String str = sc.next();
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();

		if ("+".equals(str)) {
			System.out.println(num + "+" + num1 + "=" + (num + num1));
		} else if ("-".equals(str)) {
			System.out.println(num + "-" + num1 + "=" + (num - num1));
		} else if ("*".equals(str)) {
			System.out.println(num + "*" + num1 + "=" + (num * num1));
		} else {
			System.out.printf("%d/%d=%.6f", num, num1, (double) num / num1);

		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int result = num % 2;
		
		if (result == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	public void test7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String str;
		
		if (num % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println(str);
	}

	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("1을 입력하셨군요");
		} else if (num == 2) {
			System.out.println("2을 입력하셨군요");
		} else {
			System.out.println("3입니다");
		}
	}

	public void test9() {
		System.out.println("======== 놀이공원 프로그램 ========");
		Scanner sc = new Scanner(System.in);
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int num = sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 15000원) : ");
		int num1 = sc.nextInt();
		System.out.print("아이은 몇명입니까?(1인당 5000원) : ");
		int num2 = sc.nextInt();
		
		if (num == (num1 + num2)) {
			System.out.println("지불하실 총 금액은 " + ((num1 * 15000) + (num2 * 5000)) + "원 입니다.");
		} else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}

	public void test10() {
		System.out.println("======== 퀴즈 프로그램 ========");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 퀴즈");
		System.out.print("사과는 영어로 무엇일까요(1.apple, 2. 스티브 잡스)? :");
		int num = sc.nextInt();
	
		if (num == 1) {
			System.out.println("정답!!!");
		} else {
			System.out.println("땡!!");
		}

		System.out.println("두번째 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는 (1. 비싸, 2.빨라)? :");
		int num1 = sc.nextInt();
		
		if (num1 == 2) {
			System.out.println("정답!!!");
		} else {
			System.out.println("땡!!");
		}

		
		if (num + num1 == 3) {
			if (num == 1) {
				System.out.println("총 2문제를 맞췄습니다.");
			} else {
				System.out.println("총 0문제를 맞췄습니다.");
			}
		} else {
			System.out.println("총 1문제를 맞췄습니다.");
		}

	}

	public void test11() {
		System.out.println("======== 심리테스트 ========");
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 술을 좋아하십니까(1.yes, 2.no)? : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.print("당신은 담배를 피웁니까(1.yes, 2.no)? : ");
			int num1 = sc.nextInt();
			if (num1 == 1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			} else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
			
		} else {
			System.out.print("당신은 이성친구가 있습니까(1.yes, 2.no)? : ");
			int num2 = sc.nextInt();
			if (num2 == 1) {
				System.out.println("올..ㅋ");
			} else {
				System.out.println("힘내요ㅠㅠ");
			}
		}
	}

	public void test12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========대/소문자 변환 프로그램========");
		System.out.print("문자입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println("===== 결과 =====");
		
		if (65 <= ch && ch <= 90) {
			System.out.println("대문자를 입력 하셨습니다.");
			System.out.println("소문자로 변환: " + (char) (ch ^ 32));
		} else if (97 <= ch && ch <= 122) {
			System.out.println("소문자를 입력 하셨습니다.");
			System.out.println("대문자로 변환: " + (char) (ch ^ 32));
		} else {
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요.");
		}
	}

	public void test13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("===== 결과 =====");
		
		if (num == 0 || num%3 !=0 && num%4 != 0) {
			System.out.println("[" + num + "]" + "은(는) 3의 배수도 4의 배수도 아닙니다.");
		} else if (num % 3 == 0 && num % 4 == 0) {
			System.out.println("[" + num + "]" + "은(는) 3의 배수면서 4의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println("[" + num + "]" + "은(는) 3의 배수입니다.");
		} else if (num % 4 == 0) {
			System.out.println("[" + num + "]" + "은(는) 4의 배수입니다.");
		}

	}
}
