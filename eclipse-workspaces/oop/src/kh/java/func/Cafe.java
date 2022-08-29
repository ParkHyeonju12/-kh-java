package kh.java.func;

import java.util.Scanner;

public class Cafe {
	Scanner sc = new Scanner(System.in);
//전역변수는 파랑색, 지역변수는 노란색
	 int kind; // 1.아메리카노,2.카페라떼,3.카페모카,4.아이스티, 5.카모마일
	 boolean temp; // true = ice , false = hot
	 boolean size; // true= tall, false =grade
	 int shot; // 샷추가
	 boolean money; // true = 카드, false = 현금
	 boolean inOut; // true = 매장, false = 테이크아웃
	 int amount; //수량

	// 메뉴판(아메리카노,카페라떼,카페모카,아이스티, 카모마일)
	// 구매하기
	// 카페 운영시작 메소드

	public void start() {
		while (true) {
			System.out.println("--------카페 open~!---------");
			System.out.println("1.메뉴판보기");
			System.out.println("2. 주문하기");
			System.out.println("3. 주문내역확인");
			System.out.println("4. 종료");
			System.out.print("Menu를 선택해주세요. >>>");
			int select = sc.nextInt(); // 메뉴 선택 번호
			switch (select) {
			case 1:
				showMenu();
				break;
			case 2:
				order();
				break;
			case 3:
				showLastOrder();
				break;
			case 4:
				System.out.println("Bye~");
				return;
			}//switch 종료
		}// while종료
	}//start()종료
	//주문내역 확인 메소드
	public void showLastOrder() {
		System.out.print("주문 메뉴 :" + kind );
		switch(kind) {
		case 1:
			System.out.println("아메리카노");
			break;
		case 2:
			System.out.println("카페라떼");
			break;
		case 3:
			System.out.println("카페모카");
			break;
		case 4:
			System.out.println("아이스티");
			break;
		case 5:
			System.out.println("카모마일");
			break;
		}
		
		if(temp) {
			System.out.println("종류는 ICE");
		}else {
			System.out.println("종류는 HOT");
		}
		
		if(size) {
			System.out.println("사이즈 : tall ");
		}else {
			System.out.println("사이즈 : grande ");
		}
		
		
			System.out.println("샷 추가: "+shot);
		
		
		if(money) {
			System.out.println("결제 수단 : 카드");
		}else {
			System.out.println("결제 수단 : 현금");
		}
		
		if(inOut) {
			System.out.println("매장이용");
		}else {
			System.out.println("테이크아웃");
		}
		
		System.out.println("주문수량 : "+amount);
	}//showLastOrder()종료

	// 주문하기 메소드
	public void order() {
		showMenu();
		System.out.print("음료를 선택하세요 : ");
		kind = sc.nextInt();
		
		System.out.print("온도 선택 [1.ICE / 2. HOT] :");
		int tempSel = sc.nextInt();
		
		if (tempSel == 1) {
			temp = true;
		} else {
			temp = false;
		}
		
		System.out.print("음료 사이즈 선택[1. tall / 2. grande] :");
		
		int sizeSel = sc.nextInt();
		if (sizeSel == 1) {
			size = true;
		} else {
			size = false;
		}
		
		if(kind !=5) {
		System.out.print("샷추가를 몇번 하시겠습니까?");
		shot = sc.nextInt();
		}else {
			shot = 0;
		}
		
		System.out.print("결제수단 선택[1.카드 / 2.현금] :");
		int moneySel = sc.nextInt();
		
		if(moneySel == 1) {
			money = true;
		}else {
			money = false;
		}
		
		System.out.print("1. 매장 / 2. 테이크아웃");
		int inOutSel = sc.nextInt();
		if(inOutSel == 1) {
			inOut = true;
		}else {
			inOut = false;
		}
		
		System.out.print("수량을 입력하세요 : ");
		amount = sc.nextInt();
		System.out.println("주문이 완료되었습니다.");
		
		brewing();
	} // order 종료

	public void brewing() {
		System.out.println("     o");
		delay(500);
		System.out.println("     o");
		delay(500);
		System.out.println("     o");
		delay(500);
		System.out.println("     o");
		delay(500);
		System.out.println("     o");
		delay(500);
		System.out.println("          \t│~~~~~~~~├─┐ ");
		System.out.println(" \\   /\\ \t│        │ │ ");
		System.out.println("  ) ( ')  \t│        ├─┘ ");
		System.out.println(" (  /  )  \t│        │   ");
		System.out.println("  \\(__)| \t└────────┘   ");
		System.out.println();
		System.out.println("음료 나왔습니다^^");
		delay(1500);
	} //brewing() 종료
	public void delay(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} //delay종료
	
	// 메뉴판 출력 메소드
	public static void showMenu() {
		System.out.println("--------음료--------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 카페모카");
		System.out.println("4. 아이스티");
		System.out.println("5. 카모마일");
	} //showMenu() 종료


} // Cafe 종료
