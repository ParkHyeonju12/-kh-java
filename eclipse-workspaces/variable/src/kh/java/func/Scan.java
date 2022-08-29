package kh.java.func;

import java.util.Scanner;

public class Scan {

	public void scan1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자열을 입력하세요 : ");
		String str1 = sc.next();
		System.out.println(str1);
		
		System.out.print("두번째 문자열을 입력하세요 : ");
		String str2 = sc.nextLine();
		System.out.println(str2);
		
		System.out.print("문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
	}
	public void scanExam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이을 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("주소을 입력하세요 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.print("키을 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게을 입력하세요 : ");
		double weight = sc.nextDouble();
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
	}
	
	public void scanExam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수를 입력 : ");
		int math = sc.nextInt();
		System.out.print("영어점수를 입력 : ");
		int eng = sc.nextInt();
		System.out.printf("당신 성적의 총 합은 %d점이고 평균은 %4.2f입니다!",kor+math+eng, (kor+math+eng)/(float)3);
	}
}
