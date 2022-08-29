package kh.java.func;

import java.util.Scanner;

public class WhileTest {
	Scanner sc =new Scanner(System.in);
	public void test1() {
		//for(초기값;조건식;증감문)
		//for(int i=0; i<5; i++)
		//초기값 설정
		int i = 0;
		while(i<5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	
	public void test2() {
		System.out.print("몇 번 출력하시겠습니까? ");
		int num = sc.nextInt();
		
		int i = 0;
		while(i<num) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	
	public void test3() {
		System.out.println("2단입니다.");
		
		int i = 1;
		while(i<10) {
			System.out.printf("%d * %d = %d\n",2,i,2*i);
			i++;
		}
	}
	
	public void test4() {
		
		int num = 0;
		
		System.out.print("몇 단을 출력하시겠습니까? ");
		num = sc.nextInt();
		
		System.out.println(num + "단 입니다.");
		
		int i = 1; 
		while(i<10) {
			System.out.printf("%d * %d = %d\n", num, i, num*i );
			i++;
		}
	}
	
	public void test5() {
		int sum = 0; //입력받은 정수의 합을 저장할 변수
		
		int i =0;
		while(i<5) {
			System.out.print("정수 값을 입력하시오 : ");
			sum += sc.nextInt();
			i++;
		}
		
		System.out.println("입력한 5개의 정수의 합 : "+sum);
	}
	
	public void test6() {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		System.out.print("첫번째 수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		num2 = sc.nextInt();
		
		int i = num1;
		while(i<=num2) {
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d\n",num1,num2,sum );
	}
	
	public void test7() {
		int num1 = 0;
		int sum = 0;
		
		System.out.print("숫자입력 : ");
		num1 = sc.nextInt(); // 6
		
		int i =0;
		while(i<=num1) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("짝수들의 합은 : " + sum);
	}
	
	public void test8() {
		for (int i = 0; i < 5; i++) {
			System.out.println("**********");
		}
	}
	
	public void test9() {
		for(int j = 0; j<10; j++) {
			System.out.print("*");
		}
		System.out.println();
	}


	public void test10() {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public void test11() {
//		System.out.println("*");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
//		System.out.println("*****");
		
		for(int i = 0, j = 0; i<5; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void test12() {
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		do {
			System.out.println("10을 입력하셨네요");
			num++;
		}
		while(num == 10);
		
	}
	
	public void test13() {
//		for(;;) {
//			System.out.println("안녕하세요");
		
		while(true) {
			System.out.println("안녕하세요");
		}
	}
	public void test14() {
		while(true) {
			System.out.println("안녕하세요");
			System.out.print("한번 더 출력할까요?(1.yes/2.no) : ");
			
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("ok!");
			}else if(select ==2){
			}
			System.out.println("반복문 마지막 코드");
		}
	}
	
	public void test15() {
		for (int i = 0; i < 5; i++) {
			
			System.out.println("i : " + i);
			System.out.print("1/2/3 중 하나를 선택하세요");
			
			int select = sc.nextInt();
			
			if (select == 1) {
				break;
			
			} else if (select == 2) {
				continue;
			
			} else {
				System.out.println("그 외 나머지");
				System.out.println();
			}
			System.out.println("반복문 마지막부분");
			System.out.println();
		}
		System.out.println("반복문 끝나면 출력되는 문구");
		System.out.println();
	}
}
