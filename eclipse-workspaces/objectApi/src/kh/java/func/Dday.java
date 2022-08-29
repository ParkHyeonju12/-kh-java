package kh.java.func;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Dday {
	private static final int Year = 0;
	Scanner sc = new Scanner(System.in);
	
	public void dday() {
		System.out.println("===========D-DAY 계산기==========");
		System.out.print("D-DAY [년도] 입력 :");
		int y = sc.nextInt();
		System.out.print("D-DAY [월] 입력 :");
		int m = sc.nextInt();
		System.out.print("D-DAY [일] 입력 :");
		int d = sc.nextInt();
		
		//오늘날짜
//		Date today = new Date();
//		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String todayStr = format1.format(today);
		
		Calendar today = Calendar.getInstance();
		
		long timeB = today.getTimeInMillis();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 M월 d일");
		String dateStr = format.format(timeB);
		
		//D-DAY날짜
		Calendar today1 = Calendar.getInstance();
		today1.set(y, m-1, d);
		
		long timeA = today1.getTimeInMillis();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String date1Str = format.format(timeA);
		
		System.out.println("오늘날짜 : "+dateStr);
		System.out.println("D-DAY 날짜 : "+date1Str);
		
		//날짜 차이 계산
		long timeAA = today.getTimeInMillis();//1960년부터 오늘까지
		today.set(y, m-1, d);
		long timeBB = today.getTimeInMillis();//1960년부터 D-DAY까지
		long dday1 = (timeBB-timeAA)/(1000*60*60*24);
		
		if(dday1 == 0) {
			System.out.println("D-DAY 입니다.");
		}else if(dday1>0){
			System.out.println(Math.abs(dday1)+"일 남았습니다.");
		}else {
			System.out.println(Math.abs(dday1)+"일 지났습니다.");
			
		}
		
		
	}
	public void dDAysamver() {
		System.out.println("===========D-DAY 계산기==========");
		System.out.print("D-DAY [년도] 입력 :");
		int y = sc.nextInt();
		System.out.print("D-DAY [월] 입력 :");
		int m = sc.nextInt();
		System.out.print("D-DAY [일] 입력 :");
		int d = sc.nextInt();
		
		Calendar today = Calendar.getInstance();
		String todayString 
		= today.get(Calendar.YEAR)+"년"
		+ (today.get(Calendar.MONTH)+1)+"월"
		+ today.get(Calendar.DATE)+"일";
		
		Calendar dday = Calendar.getInstance();
		dday.set(Calendar.YEAR, y);
		dday.set(Calendar.MONTH, m-1);
		dday.set(Calendar.DATE, d);
		long ddayMs = dday.getTimeInMillis();
		SimpleDateFormat format
		= new SimpleDateFormat("yyyy년 M월 d일");
		Date ddayDate = new Date(ddayMs);
		String ddayStr = format.format(ddayDate);
		System.out.println("오늘날짜 : "+todayString);
		System.out.println("dday날짜 : "+ddayStr);
		long todayMs = today.getTimeInMillis();
				
		
	}
	public void wrap() {
		//정수형(기본형변수) 선언 후 10대입
		int num = 10;
		//wrapper 클래스 사용(int -> Integer
		Integer num2 = new Integer(10); //boxing
		int num3 = num2.intValue(); //unboxing
		
		System.out.println(num3);
		
		Integer num4 =10;//auto-boxing
		int num5 = num4;//auto-unboxing
		
		double d1 = 3.14;
		System.out.println(d1);
		
		//wrapper클래스 (double -> Double)
		Double d2 = new Double(3.14);//boxing
		double d3 = d2.doubleValue();//unboxing
		
		System.out.println(d3);
		
		Double d4 = 3.14;//boxing
		double d5 = 3.14;//unboxing
	}
	
	public void wrap2() {
		//wrapper클래스 사용 예) 기본형<-> 문자열 형변환
		//1) 문자열 -> 기본형 
		String str1 = "100";
		System.out.println(str1+1); //출력결과: 1001
		
		int num = Integer.parseInt(str1);//왕중요
		
		System.out.println(num+1);//출력결과 101
		
		String str2 = "100a";
		//주의사항은 정수로 못바꾸는 문자열을 바꾸려고 하면 안됨
//		int num2 = Integer.parseInt(str2);//에러남
				
		String str3 ="3.14";
		double dNum = Double.parseDouble(str3);
		System.out.println(dNum);
		
		//문자열 -> 문자
		String str4 = "ABCDE";
		char ch = str4.charAt(0);
		
		//기본형 -> 문자열
		int num1 = 100;
		String str5 = Integer.valueOf(num1).toString();
		System.out.println(str5);
		
		//Double사용
		double dNum2 = 3.14;
		String str6 = Double.valueOf(dNum2).toString();
		System.out.println(str6);
		
		//String클래스사용 +(이게 더 편함ㅋㅎ)
		String str7 = String.valueOf(num1);
		String str8 = String.valueOf(dNum2);
		
		
	}
	
}
