package kh.java.func;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiTest {
	public void math() {
		// 객체를 생성하지 않고 바로 사용
		System.out.println(Math.abs(10)); // 절댓값
		System.out.println(Math.abs(-10));
		// 올림, 버림, 반올림

		// 소수 첫자리에서 올림 -> 11
		System.out.println(Math.ceil(10.1));
		// 소수 첫자리에서 버림 -> 10
		System.out.println(Math.floor(10.9));
		// 소수 첫자리에서 반올림 -> 11
		System.out.println(Math.round(10.5));
		// 소수 첫자리에서 반올림 -> 10
		System.out.println(Math.round(10.4));

		// 1.3456 ->소수 3째 자리에서 반올림 : 1.35
		System.out.println(Math.round(1.3456 * 100) / (double) 100);
		// 숫자비교
		// 매개변수로 전달한 두 숫자중 큰수를 리턴
		System.out.println(Math.max(50, 30));
		System.out.println(Math.min(50, 30));
	}

	public void date() {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String todayStr = format1.format(today);
		System.out.println(todayStr);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 EEE요일");
		String todayStr1 = format2.format(today);
		System.out.println(todayStr1);
	}

	public void calendar() {
		// Calendar클래스의 생성자의 접근제어지시자가 protected
		// getInstance()메소드를 통해서만 객체 생성이 가능
		// 정보를 가져오는 방법 today.get(정보종류);
		Calendar today = Calendar.getInstance();
		// 년도 정보를 가지고 옴
		System.out.println(today.get(Calendar.YEAR));
		// 월(0~11)
		System.out.println(today.get(Calendar.MONTH) + 1);
		System.out.println(today.get(Calendar.DATE));
		// AM = 0, PM = 1
		System.out.println(today.get(Calendar.AM_PM));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		// 1:일요일 ~ 7: 토요일
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println("-------------------------");
		Calendar day1 = Calendar.getInstance();
		System.out.println(day1.get(Calendar.MONTH) + 1);// 월(0~11)+1;
		System.out.println(day1.get(Calendar.DATE));// 7
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));// 5

		// 날짜랑 시간정보 변경
		day1.set(Calendar.MONTH, 10);
		day1.set(Calendar.DATE, 18);
		System.out.println(day1.get(Calendar.MONTH) + 1);// 월(0~11)+1;
		System.out.println(day1.get(Calendar.DATE));//
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));//
		
		//1960년 1월 1일부터 day2까지 몇 ms가 흘렀는지 리턴
		Calendar day2 = Calendar.getInstance();
		long time1 = day2.getTimeInMillis();//1960년부터 오늘까지
		day2.set(Calendar.DATE, 8);
		long time2 = day2.getTimeInMillis();//1960년부터 내일까지
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time2-time1);
		
		Date date1 = new Date(time1);
		Date date2 = new Date(time2);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1Str = format.format(date1);
		String date2Str = format.format(date2);
		System.out.println(date1Str);
		System.out.println(date2Str);
	
	}
}
