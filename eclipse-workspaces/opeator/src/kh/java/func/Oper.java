package kh.java.func;

import java.util.Scanner;

public class Oper {
	public void test1() {
		int num = 10;
		System.out.println("num : " + num);
		num += 5;
		System.out.println("num : " + num);
		num *= 3;
		System.out.println("num : " + num);
		num--;
		System.out.println("num : " + num);
		--num;
		System.out.println("num : " + num);
		int num1 = 10;
		int num2 = (num1++) +2; //12
		//num1 = 11, num2 = 12
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 = (++num2)+2;//13+2=15
		System.out.println("num2 : " + num2);
		
		int a = 10;
		int b = 10;
		int c;
		c = (a++) + (++b) + a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
		public void test2() {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("num1 < num2 : " + (num1 < num2) );
			System.out.println("num1 > num2 : " + (num1 > num2) );
			System.out.println("num1 <= num2 : " + (num1 <= num2) );
			System.out.println("num1 >= num2 : " + (num1 >= num2) );
			System.out.println("num1 == num2 : " + (num1 == num2) );
			System.out.println("num1 != num2 : " + (num1 != num2) );
		}
		
		public void test3() {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 수 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("세번째 수 입력 : ");
			int num3 = sc.nextInt();
			System.out.print("네번째 수 입력 : ");
			int num4 = sc.nextInt();
			boolean result1 = num1 < num2;
			boolean result2 = num3 < num4;
			System.out.println("result1 : " + result1);
			System.out.println("result2 : " + result2);
			System.out.println("result1&&result2 : " + (result1&&result2));
			System.out.println("result1||result2 : " + (result1||result2));
			System.out.println("!result1 : " + result1);
		}
		
		public void test4() {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			int result = num1<num2?num1:num2;
			System.out.println("result : " + result);
		}
		
		public void test5() {
			Scanner sc = new Scanner(System.in);
			System.out.print("나이를 입력하세요 : ");
			int num1 = sc.nextInt();
//			String A1 = "성인입니다. 어서오세요";
//			String A2 = "미성년자는 입장불가입니다.";
//		
//			System.out.println((num1>19)?A1:A2);
			
			System.out.println(num1>19?"성인입니다.":"미성년자입니다.");
		}
		
}
