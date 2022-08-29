package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	public void test1() {
		//정수형변수 5개를 선언한 후 1/2/3/4/5를 저장하고 출력
		int num0 = 1;
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		int num4 = 5;
		
		System.out.println("변수를 이용한 값 출력");
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		int[] num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		
		System.out.println("배열을 이용한 값 출력");
		System.out.println(num[0]);
		
		//배열의 경우 반복문을 이용해서 출력 가능
		System.out.println("반복문을 이용한 값 출력");
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
	public void test2() {
		//배열의 데이터 1,2,3,4,5 넣기
		//1) 길이가 5인 배열 선언 후 인덱스번호로 데이터 넣기
		int[] arr1 = new int[5];
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
			System.out.print(",");
		}
		System.out.println();
		//인덱스번호를 이용한 값 대입 후 출력
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		for(int i=0;i<arr1.length; i++) {
			System.out.print(arr1[i]);
			System.out.print(",");
		}
		
		System.out.println();
		//2) 배열 선언 시 동시에 값 대입
		int[] arr2 = {1,2,3,4,5};
		
		for(int i =0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
			System.out.print(",");
		}
	}
	
	public void test3() {
		//배열에 "hi","Hello", "bye"를 대입
		//1) 길이가 3인 배열을 선언하여 인덱스이용해서 대입
		String[] str0 = new String[3];
		str0[0] = "hi";
		str0[1] = "Hello";
		str0[2] = "bye";
				
		//2) 배열 선언하면서 동시에 값 대입 {} 이용
		String[] str1 = {"hi", "Hello", "bye"};
		
		for(int i=0; i<str0.length; i++) {
			System.out.println(str0[i]);
		}
		System.out.println();
		
		for(int i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}
	}
	
	public void test4() {
		// 길이가 4인 정수형 배열 선언
		// 스캐너를 이용해서 
		// 국어점수, 수학점수, 영어점수를 입력받아서 배열에 저장
		// 배열 마지막공간에는 합계를 저장
		// 출력 국어점수/수학점수/영어점수/합계/평균
		// 출력 예
		// 국어 : 80 / 수학 : 50 / 영어 : 30 
		// 합계 : 160 / 평균 : 53.33
	
		
		
		int num[] = new int[4];
		
		System.out.println("(국어/수학/영어) 점수를 순서대로 입력하세요: ");
		
		for(int i =0; i<num.length-1; i++) {
			num[i] = sc.nextInt();
		}
		
		num[3] = num[0]+num[1]+num[2];
		
		System.out.printf(
				   "국어 : "  +num[0]+
				" / 수학 : "  +num[1]+
				" / 영어 : "  +num[2]+
				" / 합계 : "  +num[3]+
				" / 평균 : %.2f",num[3]/3.0);
		
		
	}
	
	public void test5() {
		int i = 0;
		int j = 0;
	
		int[] arr = new int[100];
		for ( i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]+",");
		}
	}
	
	public void test6() {
		int i = 0;
		int j = 0;
		// 길이가 5인 정수형 배열을 선언
		// 스캐너 +for문 이용하여 정수 5개 입력받은 후 입력받은 정수 출력

		int[] arr = new int[5];
		System.out.println("정수 5개를 입력하세요 : ");
		for (i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (j = arr.length-1; j>0; j--) {
			for (i=0; i<(arr.length-1); i++) {
				if (arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] =tmp;
				}
			}
		}
		
		for (i = 0; i < arr.length; i++) {	
			System.out.print(arr[i]);
		}
	}
	// 배열 0번째 값과 배열 1번째 값을 비교해서
	// 0번째가 큰 경우 두 수의 자리를 변경
//	if (arr[0] > arr[1]) {
//		
//		int tmp = arr[0];
//		arr[0]  = arr[1];
//		arr[1]  = tmp;
//	}
//	for (int i = 0; i < (arr.length-1); i++) {
//		if (arr[i] > arr[i + 1]) {
//				int tmp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = tmp;
//			}
//	}
	
//		if(arr[0]>arr[1]) {
//			int tmp = arr[0];
//			arr[0]  = arr[1];
//			arr[1]  = tmp;
//		}
//		if(arr[1]>arr[2]) {
//			int tmp = arr[1];
//			arr[1]  = arr[2];
//			arr[2]  = tmp;
//		}
//		if(arr[2]>arr[3]) {
//			int tmp = arr[2];
//			arr[2]  = arr[3];
//			arr[3]  = tmp;
//		}
//		if(arr[3]>arr[4]) {
//			int tmp = arr[3];
//			arr[3]  = arr[4];
//			arr[4]  = tmp;
//		}
		
	

//	public void lotto() {
//		System.out.println("이번주 로또 번호 맞추기!");
//		System.out.println("맞추면 댑악\\~^^~/");
//		System.out.println();
//		System.out.println("이번주 로또 번호를 받아보시겠습니까? (y/n)");
//		char answer = sc.next().charAt(0);
//
//		if (answer == 'y') {
//			for (int i = 1; i <= 6; i++) {
//				int lottoNum = r.nextInt(45)+1;
//				System.out.println(i + "번째 로또 번호 :" + lottoNum);
//			}
//		} else {
//			System.out.println(" ㅠ");
//		}
//	}
	
	public void lotto2() {
		int i=0; int j=0; 
		int count = 0;//맞은 개수
		int[] userNum = new int[6]; // 사용자가 입력하는 로또 배열

		System.out.println("=====로또 프로그램=====");

		for ( i = 0; i < 6; i++) { //사용자 번호 입력
			System.out.println((i+1) + "번째 번호 입력 (1~45) : ");
			userNum[i] = sc.nextInt();
			if(1>userNum[i] || userNum[i] >45) {
				System.out.println("1~45 사이의 숫자를 입력하세요.");
				i--;
				continue;
			}
			
			//사용자 입력 숫자는
			//1) 1~45 사이값인지
			//2) 이전에 입력을 했던 번호인지
			
			
			for (j = 0; j < i; j++) { // 사용자 번호 중복체크
				if (userNum[i] == userNum[j]) {
					i--;
					System.out.println("이미 중복된 번호입니다. 다시입력해주세요");
					break;
				}
				
			}	
			}
		
		for ( i = userNum.length-1; i>0; i--) {  //사용자 번호 오름차순정리
			for ( j = 0; j < userNum.length-1; j++) {
				if (userNum[j] > userNum[j+1]) {
					int tmp = userNum[j];
					userNum[j] = userNum[j+1];
					userNum[j+1] = tmp;
				}
			}
		}

		int[] comInput = new int[6]; // 컴퓨터 번호 배열

		for ( i = 0; i < comInput.length; i++) {  // 컴퓨터 번호 배열에 숫자 넣기
			comInput[i] = (int) (Math.random() * 45) + 1;

			for ( j = 0; j < i; j++) {  //컴퓨터 번호 배열 중복 체크
				if (comInput[i] == comInput[j]) {
					i--;
					break;
				}
			}
		}
	

		for ( i=comInput.length-1; i>0; i--) { //컴퓨터 오름차순 정리
			for ( j=0; j<comInput.length-1; j++) {
				if (comInput[j] > comInput[j+1]) {
					int tmp = comInput[j];
					comInput[j] = comInput[j+1];
					comInput[j+1] = tmp;
				}
			}
		} //컴퓨터 오름차순 정리 끝
		
		System.out.println("=====최종 결과=====");

		System.out.println("사용자 번호 : ");
		for ( i = 0; i < userNum.length; i++) {
			System.out.print(userNum[i] + " ");
		}

		System.out.println();
		System.out.println();
		
		System.out.println("컴퓨터 번호 : ");

		for ( i = 0; i < comInput.length; i++) {
			System.out.print(comInput[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for(i=0; i<userNum.length; i++ ) {
			for(j=0; j<userNum.length; j++) {
				if(userNum[i] == comInput[j]) {
					count ++;
				}
			}
		}
		System.out.println("맞은 개수 : "+ count);
		
		switch (count) {
		case 6:
			System.out.println("1등!");
			break;
		case 5:
			System.out.println("2등!");
			break;
		case 4:
			System.out.println("3등!");
			break;
		case 3:
			System.out.println("4등!");
			break;
		default:
			System.out.println("꽝!");
			break;
		}
	}
	
	public void motel() {
		//정수배열 선언 길이 10
		boolean[] rooms = new boolean[10];
		//배열의 각 인덱스가 방을 의미
		//0인 경우 비어있는방
		//1인 경우 손님이 있는 방
		int menu = 0;
		int roomNum = 0;//입실방번호
		int i = 0;
		int j = 0;
		int outNum = 0;//퇴실 방번호
		
		while(true) {
		System.out.println("모텔관리프로그램 v1.0");
		System.out.println("1.입실 2.퇴실 3. 방보기 4.종료");
		System.out.print("선택 > ");
		menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.print("몇번방에 입실하시겠습니까?");
			roomNum = sc.nextInt();
			rooms[roomNum-1] = true;
			break;
		case 2:
			System.out.print("몇번방에서 퇴실하시겠습니까?");
			roomNum = sc.nextInt();
			rooms[roomNum-1] = false;
			break;
		case 3:
			
			for(i=0; i<rooms.length; i++) {
				
				if(rooms[i]) {
					System.out.println((i+1)+"번방이 현재 비어있습니다.");
				}else {
					System.out.println((i+1)+"번방에는 현재 손님이 있습니다.");
				}
			}
			break;
		case 4:
			break;
		}//switch 끝
	}// while 끝
}
}
		


//for(i=1; i<rooms.length; i++) {
//	if(num%2==0) {
//		System.out.println(rooms[userRoom+i-1]+"방은 현재 비어있습니다.");
//	}else {
//		System.out.println(rooms[userRoom+i-1]+"방에는 현재 손님이 있습니다.");
//	}
//	
//}
	

		
	


