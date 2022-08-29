package kh.or.iei.cafe.controller;

import java.util.Scanner;

import kh.or.iei.cafe.controller.Controller.CafeController;
import kh.or.iei.cafe.view.CafeView;
import kh.or.iei.cafe.vo.MenuKind;

public class ControllerImp1 implements CafeController {

	private Scanner sc;
	private CafeView view;
	private MenuKind[] drinkMenu;
	private int index;
	
	public ControllerImp1() {
		super();
		sc = new Scanner(System.in);
		view = new CafeView();
		drinkMenu = new MenuKind[50]; //추가된 음료 메뉴를 저장할 배열
	}

	@Override
	public void main() {
		while(true) {
		int sel = view.showMenu1();
		switch (sel) {
		case 1:
			int sel1 = view.showMenu2();
			switch(sel1) {
			case 1:
				addDrink();
				break;
			case 2:
				updateDrink();
				
				break;
			case 3:
				deleteDrink();
				break;
			case 4:
				inventoryDrink();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 0:
				return;
			}
			break;
			
		case 2:
			int sel2 = view.showMenu3();
			switch(sel2) {
			case 1: 
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 0: 
				return;
			}
			break;
		case 3:
			System.out.println("안녕히 가세요"); 
			return;
		} // switch종료
	} //main 종료
	} //while종료
		

	@Override
	public void addDrink() {
		drinkMenu[index++] = view.addDrink();
	}

	@Override
	public void updateDrink() { // 메뉴 수정
		int searchIndex = searchMenu(view.getName("수정"));

		if (searchIndex == -1) {
			view.nosearchName();
		} else {
			drinkMenu[searchIndex] = view.updateDrink();
		}
	}

	@Override
	public void deleteDrink() {
		int searchIndex = searchMenu(view.getName("삭제"));

		if (searchIndex == -1) {
			view.nosearchName();
		} else {
			for (int i = searchIndex; i < index - 1; i++) {
				drinkMenu[i] = drinkMenu[i + 1];
			}
			index --;
			view.msg("삭제");
		} 
	}

	public int searchMenu(String name) {
		for (int i = 0; i < index; i++) {
			MenuKind m = drinkMenu[i];
			if (name.equals(m.getMenuName())) {
				return i;
			} // if종료
		}return -1;
	}// searchMenu(String name)종료
	
	
	@Override
	public void inventoryDrink() {
		view.inventoryDrink(drinkMenu, index);
	}

	@Override
	public void inventoryDessert() {
			
	}

	@Override
	public void addDessert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDessert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDessert() {
		// TODO Auto-generated method stub
		
	}
	
}


