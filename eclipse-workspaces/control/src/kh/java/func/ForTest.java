package kh.java.func;

import java.util.Scanner;

public class ForTest {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		for(int i =0; i<5; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	public void test2() {
		System.out.print("몇번 출력하시겠습니까? ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	public void test3() {
		System.out.println("2단입니다.");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n",2,i,2*i);
		}
	}
	
//	쌤버전
//	public void test3() {
//		System.out.println("2단입니다.");
//		
//		for(int i=0; i<9; i++) {
//			System.out.printf("%d * %d = %d\n",2,(i+1),2*(i+1));
//		}
//	}
	
	public void test4() {
		int num = 0;
		
		System.out.print("몇단을 출력하시겠습니까? ");
		num = sc.nextInt();
		
		System.out.println(num+"단 입니다.");
		
		for(int i=0; i<9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i );
		}
	}
	
	public void test5() {
		int sum = 0; //입력받은 정수의 합을 저장할 변수
		
		for(int i=0; i<5; i++) {
			System.out.print("정수 값을 입력하시오 : ");
			sum += sc.nextInt();
		}
		
		System.out.println("입력한 5개의 정수의 합 : "+sum);
	}
	
	public void test6() {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		System.out.print("첫번째 수 입력 : ");
		num1/*10*/ = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		System.out.printf("%d ~ %d의 정수의 합 : %d\n",num1,num2,sum );
	}
	
	public void test7() {
		int num1 = 0;
		int sum = 0;

		System.out.print("숫자입력 : ");
		num1 = sc.nextInt(); // 6

		for (int i = 0; i <= num1; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println("짝수들의 합은 : " + sum);
	}
//	*쌤코드
//	public void test7() {
//		int num1 = 0;
//		int sum = 0;
//		
//		System.out.print("숫자입력 : ");
//		num1 = sc.nextInt(); // 6
//		
//		for (int i = 0; i <= num1; i+2) {
//				sum += i;
//		}
//		
//		System.out.println("짝수들의 합은 : " + sum);
//	}
	
	public void exam8() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("i : "+i+" / j : "+j);
			}
		}
	}
	
	public void exam9() {
		for(int i=1, j=1; i<10; i++) {
			for(j=2; j<10; j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}

}
