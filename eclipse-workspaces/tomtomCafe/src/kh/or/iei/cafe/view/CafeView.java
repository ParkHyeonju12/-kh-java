package kh.or.iei.cafe.view;

import java.util.Scanner;

import kh.or.iei.cafe.vo.MenuKind;

public class CafeView {

	private Scanner sc;
	public MenuKind m;
	public CafeView() {
		sc = new Scanner(System.in);
	MenuKind[] mk = null;
	}

	public int showMenu1() {

		System.out.println("=== 탐탐에 오신걸 환영합니다! ===");
		System.out.println("1.알바생");
		System.out.println("2.손님");
		System.out.println("3.종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	} //showMenu1() 끝

	public int showMenu2() {
		System.out.println("=== 음료 파트 ===");
		System.out.println("1.메뉴 추가");
		System.out.println("2.메뉴 수정");
		System.out.println("3.메뉴 삭제");
		System.out.println("4.메뉴 확인");
		System.out.println();
		System.out.println("=== 디저트 파트 ===");
		System.out.println("5.재고현황");
		System.out.println("6.디저트 추가");
		System.out.println("7.디저트 수정");
		System.out.println("8.디저트 삭제");
		System.out.println("0.처음화면으로");
		System.out.println("-------------");
		System.out.print("선택 > ");

		int sel1 = sc.nextInt();

		return sel1;
	}//showMenu2() 끝

	public int showMenu3() {
		System.out.println("1.주문 내역");
		System.out.println("2.음료 주문"); //
		System.out.println("3.디저트 주문");
		System.out.println("4.주문 취소");
		System.out.println("0.처음화면으로");
		System.out.println();
		System.out.print("선택 > ");

		int sel2 = sc.nextInt();
		return sel2;
	} //showMenu3() 끝

	 public MenuKind addDrink() {
		 System.out.print("추가할 음료 이름을 입력해주세요.(띄어쓰기x) :");
		 String addDrinkName = sc.next();
		 
		 System.out.print("추가할 음료의 판매 가격을 입력해주세요 : ");
		 int drinkPrice = sc.nextInt();
		 
		 MenuKind m = new MenuKind(addDrinkName,drinkPrice);
		 msg("추가");
		 
		 return m; 
		
	 }// addDrink()종료
	 
	 public MenuKind updateDrink(){
		 System.out.print("수정할 메뉴 이름을 입력해주세요.(띄어쓰기x) : ");
		 String name = sc.next();
		 
		 System.out.print("수정할 메뉴의 가격을 입력해주세요. : ");
		 int price = sc.nextInt();
		 
		 MenuKind m = new MenuKind(name,price);
		 return m;
	 } //updateDrink()종료
	 
	 
	 public String getName(String str) {
		 System.out.print(str+"하고 싶은 메뉴 이름을 입력해주세요.(띄어쓰기x) : ");
		 String name = sc.next();
		 return name;
	 }
	 
	 public void nosearchName() {
		 System.out.println("주문하신 메뉴를 찾을 수 없습니다.");
	 }
	 
	 public void inventoryDrink(MenuKind[] drinkMenu,int index) {
		System.out.println("===음료 내역 확인===");
		System.out.println("메뉴이름\t가격"); 
		for (int i = 0; i < index; i++) {
			MenuKind m = drinkMenu[i];
			System.out.println(m.getMenuName() + "\t" + m.getMoney());
		}
	 }
	 
	 public void msg(String str) {
		 System.out.println("메뉴 "+str+" 완료!");
	 }
	 
	 
	 
}// CafeView 종료
