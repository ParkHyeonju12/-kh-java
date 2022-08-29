package kh.java.func;

import java.util.Scanner;

public class Subway {
	Scanner sc = new Scanner(System.in);
	
	
	int menuKind; //1) 에그마요 2)써브웨이 클럽 3) 터키 4) 로스트치킨 5) 이탈리아나비엘티
	int breadSize; // true 15cm , false 30cm
	int breadKind; // 1)화이트 2) 위트 3) 플랫브레드 4) 파마산 오레가노 5) 허니오트 6) 하티
	int cheeseKind; // 1)아메리칸 치즈 2) 슈레드치즈 3) 모짜렐라치즈 4) 치즈x
	int addMenu; //1) 미트추가 2) 에그마요 3) 치즈 추가 4) 베이컨 추가 5) 오믈렛 추가 6) 아보카도 추가
	int veggie; // 0. 모두 넣음 1) 양상추 2) 토마토 3) 오이  4) 피망 5) 양파 6) 피클 7) 올리브 8) 할라피뇨
	int sauce1,sauce2,sauce3; //1) 랜치 2) 마요네스 3) 스위트 어니언 4) 허니머스타드 5) 스위트 칠리 6) 스모크 바비큐 7) 핫칠리 8)스위트칠리 9) 올리브 오일 10) 후추
	int setSelect; // true) yes , false) no
	int setMenuCookies; // 1) 라즈베리 치즈케익 2) 초콜릿칩 3) 화이트 마카다미아
	int setMenuDrink; //1) 제로콜라 2) 제로사이다
	int money; //true) 현금, false)카드
	int addOrder; //1) true: yes, false: no 
	int takeout; // true: 포장 false: 매장
	
	public void start() {
		while(true) {
			System.out.println("======WELCOME SUBWAY======");
			System.out.println("1.메뉴판");
			System.out.println("2.주문하기");
			System.out.println("3.주문내역확인");
			System.out.println("0.종료");
			System.out.println("Menu를 선택해주세요. > ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				showMenu();
				break;
			case 2:
				order();
				break;
			case 3:
				showOrder();
				break;
			case 0:
				return;
			default:
				break;
			} //switch 종료
		}//while 종료
	}//start() 종료
	
	public void showMenu() {
		System.out.println("======SUBWAY MENU======");
		System.out.println("1. 에그마요");
		System.out.println("2. 서브웨이 클럽");
		System.out.println("3. 터키");
		System.out.println("4. 로스트치킨");
		System.out.println("5. 이탈리안 비엠티");
	}//showMenu()종료
	
	public void order() {
		showMenu();
		
		System.out.print("메뉴를 선택해주세요 :");
		menuKind = sc.nextInt();
		
		System.out.println(" 빵 사이즈를 선택해주세요.");
		System.out.print("[1]15cm  [2]30cm  >>");
		breadSize =sc.nextInt();
		
		System.out.println("빵 종류를 선택해주세요 :");
		System.out.print("[1]화이트 [2]위트 [3]플랫브레드 [4]파마산오레가노 [5]허니오트 [6]하티 >>");
		breadKind = sc.nextInt();
		
		System.out.println("치즈 종류를 선택해주세요 :");
		System.out.println("[1]아메리칸치즈 [2]슈레드치즈 [3]모짜렐라치즈 [4]치즈제외");
		cheeseKind = sc.nextInt();
		
		System.out.println("추가할 메뉴를 선택해주세요. 없으면 0번");
		System.out.println("[0]없음 [1]미트 [2]에그마요 [3]치즈추가 [4]베이컨 [5]오믈렛 [6]아보카도");
		addMenu = sc.nextInt();
		
		System.out.println("빼실 야채를 선택해주세요. 다넣으면 0번");
		System.out.println("[0]다넣음 [1]양상추 [2]토마토 [3]오이 [4]피망 [5]양파 [6]피클 [7]올리브 [8]할라피뇨");
		veggie = sc.nextInt();
		
		System.out.println("소스를 선택해주세요. 최대 3개 선택/추천소스는 0번입니다.");
		System.out.println("[0]추천소스    [1]랜치      [2]마요네즈  [3]스위트어니언 [4]허니머스타드 [5]스위트칠리 ");
		System.out.println("[6]스모크바비큐 [7]허니머스타드 [8]스위트칠리 [9]올리브오일  [10]후추");
		sauce1 = sc.nextInt();
		sauce2 = sc.nextInt();
		sauce3 = sc.nextInt();
		
		System.out.println("세트로 하시겠습니까? ");
		System.out.println("[1]Yes [2]No");
		setSelect = sc.nextInt();
		
		if(setSelect == 1) {
			System.out.println("쿠키를 선택해주세요 :");
			System.out.println("[1]라즈베리치즈케익 [2]초콜릿칩 [3]화이트마카다미아");
			setMenuCookies = sc.nextInt();
			
			System.out.println("음료를 선택해주세요 : ");
			System.out.println("[1]제로콜라 [2]제로사이다");
			setMenuDrink = sc.nextInt();
		}
		
//		System.out.println("추가 주문을 하시겠습니까?");
//		System.out.println("[1]Yes [2]No");
//		addOrder = sc.nextInt();
		
		System.out.println("결제 수단을 선택해주세요.");
		System.out.println("[1]카드 [2]현금");
		
		System.out.println("[1] 포장 [2] 매장 / 포장여부를 선택해주세요");
		takeout = sc.nextInt();
		System.out.println("주문이 완료되었습니다~!");
	}//order() 종료
	
 public void showOrder() {
	 System.out.println("주문메뉴 :"+ menuKind);
	 switch(menuKind) {
	 case 1: 
		 System.out.println("에그마요");
		 break;
	 case 2: 
		 System.out.println("서브웨이 클럽");
		 break;
	 case 3: 
		 System.out.println("터키");
		 break;
	 case 4: 
		 System.out.println("로스트치킨");
		 break;
	 case 5: 
		 System.out.println("이탈리안 비엠티");
		 break;
	 }//switch종료
	 
	 System.out.println("빵 사이즈 : "+breadSize);
	 switch(breadSize) {
	 case 1:
		 System.out.println("15cm");
		 break;
	 case 2:
		 System.out.println("30cm");
		 break;
	 } //switch종료
	 
	 System.out.println("빵 종류:" + breadKind);
	 switch(breadKind) {
	 case 1:
		 System.out.println("화이트");
		 break;
	 case 2:
		 System.out.println("위트");
		 break;
	 case 3:
		 System.out.println("플랫브레드");
		 break;
	 case 4:
		 System.out.println("파마산오레가노");
		 break;
	 case 5:
		 System.out.println("허니오트");
		 break;
	 case 6:
		 System.out.println("하티");
		 break;
	 } //switch종료
	 
	 
	 
	 
	 
 }//showOrder() 종료



 } //class Subway 종료
