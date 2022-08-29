package kh.java.func;

import java.util.Random;
import java.util.StringTokenizer;

public class StringClass {
	public void test1() {
		//문자열 변경을 위한 StringBuffer사용
		//import 안하는 조건
		//1) 같은 패키지 내부의 클래스인경우
		//2) java.lang패키지 소속의 클래스인경우
		StringBuffer sb = new StringBuffer();
//		System.out.println("문자열의 길이 : "+sb.length());
//		//현재 저장된 문자열에 매개변수로 전달한 문자를 추가
//		sb.append("hi");
//		System.out.println(sb.toString());
//		sb.append(" 안녕");
//		System.out.println(sb.toString());
//		sb.append(" test");
//		System.out.println(sb.toString());
//		//첫번째 매개변수 위치에, 두번째 매개변수 값을 삽입
//		sb.insert(3, "삽입구문");
//		System.out.println(sb.toString());
//		sb.insert(7, " 여기 ");
//		System.out.println(sb.toString());
//		//문자열중 0번째부터 2번째 앞까지를 "수정구문"으로대체
//		sb.replace(0, 2, "수정구문");
//		System.out.println(sb.toString());
//		sb.delete(5, 8);
//		System.out.println(sb.toString());
//		//뒤집기
//		sb.reverse();
//		System.out.println(sb.toString());
//		
		Random r = new Random();
		StringBuffer joinCode = new StringBuffer();
		for(int i=0; i<6; i++) {
			int num = r.nextInt(10);
			joinCode.append(num);
		}
		System.out.println("회원가입 코드 ["+joinCode.toString()+"]");
	}
	
	public void test2() {
		String str = "현주/부천/코린이/짱짱";
		// "/"기준으로 잘라서 배열에 저장해줌. 문자열이 3개나오니까 길이가 3인 배열이 됨
		String[] arr = str.split("/");
		System.out.println("배열길이 : "+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		String str1 = "AbcdEfg";
		//문자열 전부 대문자로
		System.out.println(str1.toUpperCase());
		//문자열 전부 소문자로
		System.out.println(str1.toLowerCase());
//		char ch1 = str1.charAt(0);
//		char ch2 = str1.charAt(1);
//		if('a'<=ch1 && ch1 <= 'z') {
//			ch1 = (char)(ch1-32);
//		}
	}
	
	public void test3() {
		String str = "현쥬/부천/코린이/집가고싶음/";
		StringTokenizer sT = new StringTokenizer(str,"/");
		while(sT.hasMoreTokens()) {
			String str1 = sT.nextToken();
			System.out.println(str1);
		}
//		System.out.println("지금 토큰이 남아있는지 체크 : "+sT.hasMoreTokens());
//		System.out.println("남아있는 토큰 수 : "+sT.countTokens());
//		//토큰 중 가장 앞의 토큰을 꺼내옴
//		String str1 = sT.nextToken();
//		System.out.println(str1);
//		System.out.println("남아있는 토큰 수 : "+sT.countTokens());
//		String str2 = sT.nextToken();
//		System.out.println(str2);
//		System.out.println("남아있는 토큰 수 : "+sT.countTokens());
//		String str3 = sT.nextToken();
//		System.out.println(str3);
//		System.out.println("남아있는 토큰 수 : "+sT.countTokens());
//		String str4 = sT.nextToken();
//		System.out.println(str4);
//		System.out.println("남아있는 토큰 수 : "+sT.countTokens());
	}
}
